package cbit.services.grpc.profile.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: profile.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProfilesServiceGrpc {

  private ProfilesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.ProfilesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      cbit.services.grpc.profile.model.ProfileProto.Profile> getFindByNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByNumber",
      requestType = com.google.protobuf.StringValue.class,
      responseType = cbit.services.grpc.profile.model.ProfileProto.Profile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      cbit.services.grpc.profile.model.ProfileProto.Profile> getFindByNumberMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, cbit.services.grpc.profile.model.ProfileProto.Profile> getFindByNumberMethod;
    if ((getFindByNumberMethod = ProfilesServiceGrpc.getFindByNumberMethod) == null) {
      synchronized (ProfilesServiceGrpc.class) {
        if ((getFindByNumberMethod = ProfilesServiceGrpc.getFindByNumberMethod) == null) {
          ProfilesServiceGrpc.getFindByNumberMethod = getFindByNumberMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, cbit.services.grpc.profile.model.ProfileProto.Profile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindByNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.services.grpc.profile.model.ProfileProto.Profile.getDefaultInstance()))
              .setSchemaDescriptor(new ProfilesServiceMethodDescriptorSupplier("FindByNumber"))
              .build();
        }
      }
    }
    return getFindByNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      cbit.services.grpc.profile.model.ProfileProto.Profiles> getFindByCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByCustomer",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = cbit.services.grpc.profile.model.ProfileProto.Profiles.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      cbit.services.grpc.profile.model.ProfileProto.Profiles> getFindByCustomerMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, cbit.services.grpc.profile.model.ProfileProto.Profiles> getFindByCustomerMethod;
    if ((getFindByCustomerMethod = ProfilesServiceGrpc.getFindByCustomerMethod) == null) {
      synchronized (ProfilesServiceGrpc.class) {
        if ((getFindByCustomerMethod = ProfilesServiceGrpc.getFindByCustomerMethod) == null) {
          ProfilesServiceGrpc.getFindByCustomerMethod = getFindByCustomerMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, cbit.services.grpc.profile.model.ProfileProto.Profiles>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindByCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.services.grpc.profile.model.ProfileProto.Profiles.getDefaultInstance()))
              .setSchemaDescriptor(new ProfilesServiceMethodDescriptorSupplier("FindByCustomer"))
              .build();
        }
      }
    }
    return getFindByCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      cbit.services.grpc.profile.model.ProfileProto.Profiles> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = com.google.protobuf.Empty.class,
      responseType = cbit.services.grpc.profile.model.ProfileProto.Profiles.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      cbit.services.grpc.profile.model.ProfileProto.Profiles> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, cbit.services.grpc.profile.model.ProfileProto.Profiles> getFindAllMethod;
    if ((getFindAllMethod = ProfilesServiceGrpc.getFindAllMethod) == null) {
      synchronized (ProfilesServiceGrpc.class) {
        if ((getFindAllMethod = ProfilesServiceGrpc.getFindAllMethod) == null) {
          ProfilesServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, cbit.services.grpc.profile.model.ProfileProto.Profiles>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.services.grpc.profile.model.ProfileProto.Profiles.getDefaultInstance()))
              .setSchemaDescriptor(new ProfilesServiceMethodDescriptorSupplier("FindAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbit.services.grpc.profile.model.ProfileProto.Profile,
      cbit.services.grpc.profile.model.ProfileProto.Profile> getAddProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProfile",
      requestType = cbit.services.grpc.profile.model.ProfileProto.Profile.class,
      responseType = cbit.services.grpc.profile.model.ProfileProto.Profile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbit.services.grpc.profile.model.ProfileProto.Profile,
      cbit.services.grpc.profile.model.ProfileProto.Profile> getAddProfileMethod() {
    io.grpc.MethodDescriptor<cbit.services.grpc.profile.model.ProfileProto.Profile, cbit.services.grpc.profile.model.ProfileProto.Profile> getAddProfileMethod;
    if ((getAddProfileMethod = ProfilesServiceGrpc.getAddProfileMethod) == null) {
      synchronized (ProfilesServiceGrpc.class) {
        if ((getAddProfileMethod = ProfilesServiceGrpc.getAddProfileMethod) == null) {
          ProfilesServiceGrpc.getAddProfileMethod = getAddProfileMethod =
              io.grpc.MethodDescriptor.<cbit.services.grpc.profile.model.ProfileProto.Profile, cbit.services.grpc.profile.model.ProfileProto.Profile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.services.grpc.profile.model.ProfileProto.Profile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.services.grpc.profile.model.ProfileProto.Profile.getDefaultInstance()))
              .setSchemaDescriptor(new ProfilesServiceMethodDescriptorSupplier("AddProfile"))
              .build();
        }
      }
    }
    return getAddProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfilesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfilesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfilesServiceStub>() {
        @java.lang.Override
        public ProfilesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfilesServiceStub(channel, callOptions);
        }
      };
    return ProfilesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfilesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfilesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfilesServiceBlockingStub>() {
        @java.lang.Override
        public ProfilesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfilesServiceBlockingStub(channel, callOptions);
        }
      };
    return ProfilesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfilesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfilesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfilesServiceFutureStub>() {
        @java.lang.Override
        public ProfilesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfilesServiceFutureStub(channel, callOptions);
        }
      };
    return ProfilesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findByNumber(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByNumberMethod(), responseObserver);
    }

    /**
     */
    default void findByCustomer(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profiles> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByCustomerMethod(), responseObserver);
    }

    /**
     */
    default void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profiles> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    default void addProfile(cbit.services.grpc.profile.model.ProfileProto.Profile request,
        io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProfileMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProfilesService.
   */
  public static abstract class ProfilesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProfilesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProfilesService.
   */
  public static final class ProfilesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProfilesServiceStub> {
    private ProfilesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfilesServiceStub(channel, callOptions);
    }

    /**
     */
    public void findByNumber(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByCustomer(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profiles> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profiles> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProfile(cbit.services.grpc.profile.model.ProfileProto.Profile request,
        io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProfilesService.
   */
  public static final class ProfilesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProfilesServiceBlockingStub> {
    private ProfilesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfilesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cbit.services.grpc.profile.model.ProfileProto.Profile findByNumber(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbit.services.grpc.profile.model.ProfileProto.Profiles findByCustomer(com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbit.services.grpc.profile.model.ProfileProto.Profiles findAll(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbit.services.grpc.profile.model.ProfileProto.Profile addProfile(cbit.services.grpc.profile.model.ProfileProto.Profile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProfilesService.
   */
  public static final class ProfilesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProfilesServiceFutureStub> {
    private ProfilesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfilesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbit.services.grpc.profile.model.ProfileProto.Profile> findByNumber(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbit.services.grpc.profile.model.ProfileProto.Profiles> findByCustomer(
        com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbit.services.grpc.profile.model.ProfileProto.Profiles> findAll(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbit.services.grpc.profile.model.ProfileProto.Profile> addProfile(
        cbit.services.grpc.profile.model.ProfileProto.Profile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_NUMBER = 0;
  private static final int METHODID_FIND_BY_CUSTOMER = 1;
  private static final int METHODID_FIND_ALL = 2;
  private static final int METHODID_ADD_PROFILE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_NUMBER:
          serviceImpl.findByNumber((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profile>) responseObserver);
          break;
        case METHODID_FIND_BY_CUSTOMER:
          serviceImpl.findByCustomer((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profiles>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profiles>) responseObserver);
          break;
        case METHODID_ADD_PROFILE:
          serviceImpl.addProfile((cbit.services.grpc.profile.model.ProfileProto.Profile) request,
              (io.grpc.stub.StreamObserver<cbit.services.grpc.profile.model.ProfileProto.Profile>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFindByNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              cbit.services.grpc.profile.model.ProfileProto.Profile>(
                service, METHODID_FIND_BY_NUMBER)))
        .addMethod(
          getFindByCustomerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int32Value,
              cbit.services.grpc.profile.model.ProfileProto.Profiles>(
                service, METHODID_FIND_BY_CUSTOMER)))
        .addMethod(
          getFindAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              cbit.services.grpc.profile.model.ProfileProto.Profiles>(
                service, METHODID_FIND_ALL)))
        .addMethod(
          getAddProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cbit.services.grpc.profile.model.ProfileProto.Profile,
              cbit.services.grpc.profile.model.ProfileProto.Profile>(
                service, METHODID_ADD_PROFILE)))
        .build();
  }

  private static abstract class ProfilesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProfilesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbit.services.grpc.profile.model.ProfileProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProfilesService");
    }
  }

  private static final class ProfilesServiceFileDescriptorSupplier
      extends ProfilesServiceBaseDescriptorSupplier {
    ProfilesServiceFileDescriptorSupplier() {}
  }

  private static final class ProfilesServiceMethodDescriptorSupplier
      extends ProfilesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProfilesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProfilesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfilesServiceFileDescriptorSupplier())
              .addMethod(getFindByNumberMethod())
              .addMethod(getFindByCustomerMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getAddProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
