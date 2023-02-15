package com.authenticationservice.services.impl;

import com.authenticationservice.AuthenticationRequest;
import com.authenticationservice.AuthenticationResponse;
import com.authenticationservice.services.AuthenticationService;
import com.authenticationservice.services.CustomUserDetailsService;
import com.authenticationservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
  @Autowired
  private CustomUserDetailsService customUserDetailsService;
  @Autowired
  private JwtUtil jwtUtil;
  @Autowired
  private AuthenticationManager authenticationManager;
  @Override
  public AuthenticationResponse authenticateUser(final AuthenticationRequest request){
    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
        request.getUsername(),request.getPassword()));
    final String jwtToken=jwtUtil.generateJwtToken(
          customUserDetailsService.loadUserByUsername(request.getUsername()));
    return AuthenticationResponse.newBuilder().setJwtToken(jwtToken).build();
  }
}
