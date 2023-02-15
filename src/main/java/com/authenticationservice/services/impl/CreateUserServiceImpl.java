package com.authenticationservice.services.impl;

import com.authenticationservice.CreateUserRequest;
import com.authenticationservice.CreateUserResponse;
import com.authenticationservice.constants.ExceptionMessageConstants;
import com.authenticationservice.exceptions.ResourceException;
import com.authenticationservice.services.CreateUserService;
import com.authenticationservice.services.CustomUserDetailsService;
import com.authenticationservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserServiceImpl implements CreateUserService {
  @Autowired
  private CustomUserDetailsService customUserDetailsService;
  @Autowired
  private JwtUtil jwtUtil;
  @Override
  public CreateUserResponse createUser(CreateUserRequest request) {
    if(customUserDetailsService.isUserPresent(request.getUsername())){
      throw new ResourceException(ExceptionMessageConstants.USERNAME_EXISTS);
    }
    //save user
    final String jwtToken=jwtUtil.generateJwtToken(
          customUserDetailsService.loadUserByUsername(request.getUsername()));
    return CreateUserResponse.newBuilder().setJwtToken(jwtToken).build();
  }
}
