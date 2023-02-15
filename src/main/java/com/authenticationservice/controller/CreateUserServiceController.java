package com.authenticationservice.controller;

import com.authenticationservice.CreateUserRequest;
import com.authenticationservice.CreateUserResponse;
import com.authenticationservice.CreateUserServiceGrpc;
import com.authenticationservice.exceptions.ResourceException;
import com.authenticationservice.services.CreateUserService;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class CreateUserServiceController extends CreateUserServiceGrpc.CreateUserServiceImplBase {
  @Autowired
  private CreateUserService createUserService;
  @Override
  public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
    try{
      responseObserver.onNext(createUserService.createUser(request));
      responseObserver.onCompleted();
    }catch (ResourceException e){
      responseObserver.onError(Status.ALREADY_EXISTS.asRuntimeException());
    }
  }
}
