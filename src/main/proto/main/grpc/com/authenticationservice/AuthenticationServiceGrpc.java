package com.authenticationservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthenticationServiceGrpc {

  private AuthenticationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.authenticationservice.AuthenticationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.authenticationservice.AuthenticationRequest,
      com.authenticationservice.AuthenticationResponse> getAuthenticateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authenticateUser",
      requestType = com.authenticationservice.AuthenticationRequest.class,
      responseType = com.authenticationservice.AuthenticationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authenticationservice.AuthenticationRequest,
      com.authenticationservice.AuthenticationResponse> getAuthenticateUserMethod() {
    io.grpc.MethodDescriptor<com.authenticationservice.AuthenticationRequest, com.authenticationservice.AuthenticationResponse> getAuthenticateUserMethod;
    if ((getAuthenticateUserMethod = AuthenticationServiceGrpc.getAuthenticateUserMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getAuthenticateUserMethod = AuthenticationServiceGrpc.getAuthenticateUserMethod) == null) {
          AuthenticationServiceGrpc.getAuthenticateUserMethod = getAuthenticateUserMethod =
              io.grpc.MethodDescriptor.<com.authenticationservice.AuthenticationRequest, com.authenticationservice.AuthenticationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "authenticateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authenticationservice.AuthenticationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authenticationservice.AuthenticationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("authenticateUser"))
              .build();
        }
      }
    }
    return getAuthenticateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthenticationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceStub>() {
        @java.lang.Override
        public AuthenticationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceStub(channel, callOptions);
        }
      };
    return AuthenticationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceBlockingStub>() {
        @java.lang.Override
        public AuthenticationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthenticationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthenticationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceFutureStub>() {
        @java.lang.Override
        public AuthenticationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceFutureStub(channel, callOptions);
        }
      };
    return AuthenticationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthenticationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void authenticateUser(com.authenticationservice.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.authenticationservice.AuthenticationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.authenticationservice.AuthenticationRequest,
                com.authenticationservice.AuthenticationResponse>(
                  this, METHODID_AUTHENTICATE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class AuthenticationServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthenticationServiceStub> {
    private AuthenticationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceStub(channel, callOptions);
    }

    /**
     */
    public void authenticateUser(com.authenticationservice.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.authenticationservice.AuthenticationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthenticationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthenticationServiceBlockingStub> {
    private AuthenticationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.authenticationservice.AuthenticationResponse authenticateUser(com.authenticationservice.AuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthenticationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthenticationServiceFutureStub> {
    private AuthenticationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authenticationservice.AuthenticationResponse> authenticateUser(
        com.authenticationservice.AuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthenticationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthenticationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE_USER:
          serviceImpl.authenticateUser((com.authenticationservice.AuthenticationRequest) request,
              (io.grpc.stub.StreamObserver<com.authenticationservice.AuthenticationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthenticationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.authenticationservice.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthenticationService");
    }
  }

  private static final class AuthenticationServiceFileDescriptorSupplier
      extends AuthenticationServiceBaseDescriptorSupplier {
    AuthenticationServiceFileDescriptorSupplier() {}
  }

  private static final class AuthenticationServiceMethodDescriptorSupplier
      extends AuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthenticationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthenticationServiceFileDescriptorSupplier())
              .addMethod(getAuthenticateUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
