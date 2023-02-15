package com.authenticationservice.controller;

import com.authenticationservice.AuthenticationRequest;
import com.authenticationservice.AuthenticationResponse;
import com.authenticationservice.AuthenticationServiceGrpc;
import com.authenticationservice.services.AuthenticationService;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;

@GRpcService
public class AuthenticationServiceController extends
    AuthenticationServiceGrpc.AuthenticationServiceImplBase {
  @Autowired
  private AuthenticationService authenticationService;

  @Override
  public void authenticateUser(AuthenticationRequest request, StreamObserver<AuthenticationResponse> responseObserver) {
    try{
      responseObserver.onNext(authenticationService.authenticateUser(request));
      responseObserver.onCompleted();
    }catch (BadCredentialsException e){
      responseObserver.onError(Status.UNAUTHENTICATED.asRuntimeException());
    }
  }
}
