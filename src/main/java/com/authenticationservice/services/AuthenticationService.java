package com.authenticationservice.services;

import com.authenticationservice.AuthenticationRequest;
import com.authenticationservice.AuthenticationResponse;

public interface AuthenticationService {

  AuthenticationResponse authenticateUser(AuthenticationRequest request);
}
