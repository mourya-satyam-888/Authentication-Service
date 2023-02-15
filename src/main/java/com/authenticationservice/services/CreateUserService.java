package com.authenticationservice.services;

import com.authenticationservice.CreateUserRequest;
import com.authenticationservice.CreateUserResponse;

public interface CreateUserService {
  CreateUserResponse createUser(CreateUserRequest request);
}
