package cbit.service.grpc.blog.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: blog.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BlogsServiceGrpc {

  private BlogsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.BlogsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      cbit.service.grpc.blog.model.BlogProto.Blog> getFindByPeselMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByPesel",
      requestType = com.google.protobuf.StringValue.class,
      responseType = cbit.service.grpc.blog.model.BlogProto.Blog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      cbit.service.grpc.blog.model.BlogProto.Blog> getFindByPeselMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, cbit.service.grpc.blog.model.BlogProto.Blog> getFindByPeselMethod;
    if ((getFindByPeselMethod = BlogsServiceGrpc.getFindByPeselMethod) == null) {
      synchronized (BlogsServiceGrpc.class) {
        if ((getFindByPeselMethod = BlogsServiceGrpc.getFindByPeselMethod) == null) {
          BlogsServiceGrpc.getFindByPeselMethod = getFindByPeselMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, cbit.service.grpc.blog.model.BlogProto.Blog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindByPesel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.service.grpc.blog.model.BlogProto.Blog.getDefaultInstance()))
              .setSchemaDescriptor(new BlogsServiceMethodDescriptorSupplier("FindByPesel"))
              .build();
        }
      }
    }
    return getFindByPeselMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      cbit.service.grpc.blog.model.BlogProto.Blog> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = cbit.service.grpc.blog.model.BlogProto.Blog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      cbit.service.grpc.blog.model.BlogProto.Blog> getFindByIdMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, cbit.service.grpc.blog.model.BlogProto.Blog> getFindByIdMethod;
    if ((getFindByIdMethod = BlogsServiceGrpc.getFindByIdMethod) == null) {
      synchronized (BlogsServiceGrpc.class) {
        if ((getFindByIdMethod = BlogsServiceGrpc.getFindByIdMethod) == null) {
          BlogsServiceGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, cbit.service.grpc.blog.model.BlogProto.Blog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.service.grpc.blog.model.BlogProto.Blog.getDefaultInstance()))
              .setSchemaDescriptor(new BlogsServiceMethodDescriptorSupplier("FindById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      cbit.service.grpc.blog.model.BlogProto.Blogs> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = com.google.protobuf.Empty.class,
      responseType = cbit.service.grpc.blog.model.BlogProto.Blogs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      cbit.service.grpc.blog.model.BlogProto.Blogs> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, cbit.service.grpc.blog.model.BlogProto.Blogs> getFindAllMethod;
    if ((getFindAllMethod = BlogsServiceGrpc.getFindAllMethod) == null) {
      synchronized (BlogsServiceGrpc.class) {
        if ((getFindAllMethod = BlogsServiceGrpc.getFindAllMethod) == null) {
          BlogsServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, cbit.service.grpc.blog.model.BlogProto.Blogs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.service.grpc.blog.model.BlogProto.Blogs.getDefaultInstance()))
              .setSchemaDescriptor(new BlogsServiceMethodDescriptorSupplier("FindAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cbit.service.grpc.blog.model.BlogProto.Blog,
      cbit.service.grpc.blog.model.BlogProto.Blog> getAddBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBlog",
      requestType = cbit.service.grpc.blog.model.BlogProto.Blog.class,
      responseType = cbit.service.grpc.blog.model.BlogProto.Blog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cbit.service.grpc.blog.model.BlogProto.Blog,
      cbit.service.grpc.blog.model.BlogProto.Blog> getAddBlogMethod() {
    io.grpc.MethodDescriptor<cbit.service.grpc.blog.model.BlogProto.Blog, cbit.service.grpc.blog.model.BlogProto.Blog> getAddBlogMethod;
    if ((getAddBlogMethod = BlogsServiceGrpc.getAddBlogMethod) == null) {
      synchronized (BlogsServiceGrpc.class) {
        if ((getAddBlogMethod = BlogsServiceGrpc.getAddBlogMethod) == null) {
          BlogsServiceGrpc.getAddBlogMethod = getAddBlogMethod =
              io.grpc.MethodDescriptor.<cbit.service.grpc.blog.model.BlogProto.Blog, cbit.service.grpc.blog.model.BlogProto.Blog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.service.grpc.blog.model.BlogProto.Blog.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cbit.service.grpc.blog.model.BlogProto.Blog.getDefaultInstance()))
              .setSchemaDescriptor(new BlogsServiceMethodDescriptorSupplier("AddBlog"))
              .build();
        }
      }
    }
    return getAddBlogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlogsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogsServiceStub>() {
        @java.lang.Override
        public BlogsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogsServiceStub(channel, callOptions);
        }
      };
    return BlogsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlogsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogsServiceBlockingStub>() {
        @java.lang.Override
        public BlogsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogsServiceBlockingStub(channel, callOptions);
        }
      };
    return BlogsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlogsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogsServiceFutureStub>() {
        @java.lang.Override
        public BlogsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogsServiceFutureStub(channel, callOptions);
        }
      };
    return BlogsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findByPesel(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByPeselMethod(), responseObserver);
    }

    /**
     */
    default void findById(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    default void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blogs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    default void addBlog(cbit.service.grpc.blog.model.BlogProto.Blog request,
        io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBlogMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BlogsService.
   */
  public static abstract class BlogsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BlogsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BlogsService.
   */
  public static final class BlogsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BlogsServiceStub> {
    private BlogsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogsServiceStub(channel, callOptions);
    }

    /**
     */
    public void findByPesel(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByPeselMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blogs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBlog(cbit.service.grpc.blog.model.BlogProto.Blog request,
        io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBlogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BlogsService.
   */
  public static final class BlogsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BlogsServiceBlockingStub> {
    private BlogsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cbit.service.grpc.blog.model.BlogProto.Blog findByPesel(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByPeselMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbit.service.grpc.blog.model.BlogProto.Blog findById(com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbit.service.grpc.blog.model.BlogProto.Blogs findAll(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public cbit.service.grpc.blog.model.BlogProto.Blog addBlog(cbit.service.grpc.blog.model.BlogProto.Blog request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBlogMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BlogsService.
   */
  public static final class BlogsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BlogsServiceFutureStub> {
    private BlogsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbit.service.grpc.blog.model.BlogProto.Blog> findByPesel(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByPeselMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbit.service.grpc.blog.model.BlogProto.Blog> findById(
        com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbit.service.grpc.blog.model.BlogProto.Blogs> findAll(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cbit.service.grpc.blog.model.BlogProto.Blog> addBlog(
        cbit.service.grpc.blog.model.BlogProto.Blog request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBlogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_PESEL = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_FIND_ALL = 2;
  private static final int METHODID_ADD_BLOG = 3;

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
        case METHODID_FIND_BY_PESEL:
          serviceImpl.findByPesel((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blogs>) responseObserver);
          break;
        case METHODID_ADD_BLOG:
          serviceImpl.addBlog((cbit.service.grpc.blog.model.BlogProto.Blog) request,
              (io.grpc.stub.StreamObserver<cbit.service.grpc.blog.model.BlogProto.Blog>) responseObserver);
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
          getFindByPeselMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              cbit.service.grpc.blog.model.BlogProto.Blog>(
                service, METHODID_FIND_BY_PESEL)))
        .addMethod(
          getFindByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int32Value,
              cbit.service.grpc.blog.model.BlogProto.Blog>(
                service, METHODID_FIND_BY_ID)))
        .addMethod(
          getFindAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              cbit.service.grpc.blog.model.BlogProto.Blogs>(
                service, METHODID_FIND_ALL)))
        .addMethod(
          getAddBlogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cbit.service.grpc.blog.model.BlogProto.Blog,
              cbit.service.grpc.blog.model.BlogProto.Blog>(
                service, METHODID_ADD_BLOG)))
        .build();
  }

  private static abstract class BlogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlogsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cbit.service.grpc.blog.model.BlogProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlogsService");
    }
  }

  private static final class BlogsServiceFileDescriptorSupplier
      extends BlogsServiceBaseDescriptorSupplier {
    BlogsServiceFileDescriptorSupplier() {}
  }

  private static final class BlogsServiceMethodDescriptorSupplier
      extends BlogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BlogsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BlogsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlogsServiceFileDescriptorSupplier())
              .addMethod(getFindByPeselMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getAddBlogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
