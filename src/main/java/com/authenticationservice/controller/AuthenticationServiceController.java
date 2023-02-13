package com.authenticationservice.controller;

import com.authenticationservice.AuthenticationRequest;
import com.authenticationservice.AuthenticationResponse;
import com.authenticationservice.AuthenticationServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class AuthenticationServiceController extends
    AuthenticationServiceGrpc.AuthenticationServiceImplBase {
  @Override
  public void authenticateUser(AuthenticationRequest request, StreamObserver<AuthenticationResponse> responseObserver) {
    super.authenticateUser(request,responseObserver);
  }
}
