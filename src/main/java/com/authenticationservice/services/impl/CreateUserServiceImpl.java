package com.authenticationservice.services.impl;

import com.authenticationservice.CreateUserRequest;
import com.authenticationservice.CreateUserResponse;
import com.authenticationservice.constants.ExceptionMessageConstants;
import com.authenticationservice.entity.User;
import com.authenticationservice.exceptions.ResourceException;
import com.authenticationservice.repository.UserRepo;
import com.authenticationservice.services.CreateUserService;
import com.authenticationservice.services.CustomUserDetailsService;
import com.authenticationservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateUserServiceImpl implements CreateUserService {
  @Autowired
  private CustomUserDetailsService customUserDetailsService;
  @Autowired
  private UserRepo userRepo;
  @Autowired
  private JwtUtil jwtUtil;
  @Autowired
  private PasswordEncoder passwordEncoder;
  @Override
  public CreateUserResponse createUser(CreateUserRequest request) {
    if(customUserDetailsService.isUserPresent(request.getUsername())){
      throw new ResourceException(ExceptionMessageConstants.USERNAME_EXISTS);
    }
    final User user= User.builder()
        .username(request.getUsername())
        .password(passwordEncoder.encode(request.getPassword()))
        .build();
    userRepo.save(user);
    final String jwtToken=jwtUtil.generateJwtToken(
          customUserDetailsService.loadUserByUsername(request.getUsername()));
    return CreateUserResponse.newBuilder().setJwtToken(jwtToken).build();
  }
}
