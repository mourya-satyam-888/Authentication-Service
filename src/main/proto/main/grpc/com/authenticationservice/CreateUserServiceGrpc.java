package com.authenticationservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CreateUserServiceGrpc {

  private CreateUserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.authenticationservice.CreateUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.authenticationservice.CreateUserRequest,
      com.authenticationservice.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = com.authenticationservice.CreateUserRequest.class,
      responseType = com.authenticationservice.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authenticationservice.CreateUserRequest,
      com.authenticationservice.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.authenticationservice.CreateUserRequest, com.authenticationservice.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = CreateUserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (CreateUserServiceGrpc.class) {
        if ((getCreateUserMethod = CreateUserServiceGrpc.getCreateUserMethod) == null) {
          CreateUserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.authenticationservice.CreateUserRequest, com.authenticationservice.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authenticationservice.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authenticationservice.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CreateUserServiceMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateUserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreateUserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreateUserServiceStub>() {
        @java.lang.Override
        public CreateUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreateUserServiceStub(channel, callOptions);
        }
      };
    return CreateUserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreateUserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreateUserServiceBlockingStub>() {
        @java.lang.Override
        public CreateUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreateUserServiceBlockingStub(channel, callOptions);
        }
      };
    return CreateUserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreateUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreateUserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreateUserServiceFutureStub>() {
        @java.lang.Override
        public CreateUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreateUserServiceFutureStub(channel, callOptions);
        }
      };
    return CreateUserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CreateUserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(com.authenticationservice.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.authenticationservice.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.authenticationservice.CreateUserRequest,
                com.authenticationservice.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class CreateUserServiceStub extends io.grpc.stub.AbstractAsyncStub<CreateUserServiceStub> {
    private CreateUserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateUserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreateUserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(com.authenticationservice.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.authenticationservice.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreateUserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CreateUserServiceBlockingStub> {
    private CreateUserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateUserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreateUserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.authenticationservice.CreateUserResponse createUser(com.authenticationservice.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreateUserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CreateUserServiceFutureStub> {
    private CreateUserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateUserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreateUserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authenticationservice.CreateUserResponse> createUser(
        com.authenticationservice.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreateUserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreateUserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.authenticationservice.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.authenticationservice.CreateUserResponse>) responseObserver);
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

  private static abstract class CreateUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CreateUserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.authenticationservice.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CreateUserService");
    }
  }

  private static final class CreateUserServiceFileDescriptorSupplier
      extends CreateUserServiceBaseDescriptorSupplier {
    CreateUserServiceFileDescriptorSupplier() {}
  }

  private static final class CreateUserServiceMethodDescriptorSupplier
      extends CreateUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CreateUserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CreateUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreateUserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
