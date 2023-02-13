package com.authenticationservice.controller;

import com.authenticationservice.CreateUserRequest;
import com.authenticationservice.CreateUserResponse;
import com.authenticationservice.CreateUserServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CreateUserServiceController extends CreateUserServiceGrpc.CreateUserServiceImplBase {
  @Override
  public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
    super.createUser(request, responseObserver);
  }
}
