package iq.market.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: iq/market/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "iq.market.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QuerySwapRequest,
      iq.market.v1beta1.QueryOuterClass.QuerySwapResponse> getSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Swap",
      requestType = iq.market.v1beta1.QueryOuterClass.QuerySwapRequest.class,
      responseType = iq.market.v1beta1.QueryOuterClass.QuerySwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QuerySwapRequest,
      iq.market.v1beta1.QueryOuterClass.QuerySwapResponse> getSwapMethod() {
    io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QuerySwapRequest, iq.market.v1beta1.QueryOuterClass.QuerySwapResponse> getSwapMethod;
    if ((getSwapMethod = QueryGrpc.getSwapMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSwapMethod = QueryGrpc.getSwapMethod) == null) {
          QueryGrpc.getSwapMethod = getSwapMethod =
              io.grpc.MethodDescriptor.<iq.market.v1beta1.QueryOuterClass.QuerySwapRequest, iq.market.v1beta1.QueryOuterClass.QuerySwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Swap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iq.market.v1beta1.QueryOuterClass.QuerySwapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iq.market.v1beta1.QueryOuterClass.QuerySwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Swap"))
              .build();
        }
      }
    }
    return getSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest,
      iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse> getIqPoolDeltaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IqPoolDelta",
      requestType = iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest.class,
      responseType = iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest,
      iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse> getIqPoolDeltaMethod() {
    io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest, iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse> getIqPoolDeltaMethod;
    if ((getIqPoolDeltaMethod = QueryGrpc.getIqPoolDeltaMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIqPoolDeltaMethod = QueryGrpc.getIqPoolDeltaMethod) == null) {
          QueryGrpc.getIqPoolDeltaMethod = getIqPoolDeltaMethod =
              io.grpc.MethodDescriptor.<iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest, iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IqPoolDelta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IqPoolDelta"))
              .build();
        }
      }
    }
    return getIqPoolDeltaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QueryParamsRequest,
      iq.market.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = iq.market.v1beta1.QueryOuterClass.QueryParamsRequest.class,
      responseType = iq.market.v1beta1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QueryParamsRequest,
      iq.market.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<iq.market.v1beta1.QueryOuterClass.QueryParamsRequest, iq.market.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<iq.market.v1beta1.QueryOuterClass.QueryParamsRequest, iq.market.v1beta1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iq.market.v1beta1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  iq.market.v1beta1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Swap returns simulated swap amount.
     * </pre>
     */
    public void swap(iq.market.v1beta1.QueryOuterClass.QuerySwapRequest request,
        io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QuerySwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapMethod(), responseObserver);
    }

    /**
     * <pre>
     * IqPoolDelta returns iq_pool_delta amount.
     * </pre>
     */
    public void iqPoolDelta(iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest request,
        io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIqPoolDeltaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(iq.market.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                iq.market.v1beta1.QueryOuterClass.QuerySwapRequest,
                iq.market.v1beta1.QueryOuterClass.QuerySwapResponse>(
                  this, METHODID_SWAP)))
          .addMethod(
            getIqPoolDeltaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest,
                iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse>(
                  this, METHODID_IQ_POOL_DELTA)))
          .addMethod(
            getParamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                iq.market.v1beta1.QueryOuterClass.QueryParamsRequest,
                iq.market.v1beta1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Swap returns simulated swap amount.
     * </pre>
     */
    public void swap(iq.market.v1beta1.QueryOuterClass.QuerySwapRequest request,
        io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QuerySwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IqPoolDelta returns iq_pool_delta amount.
     * </pre>
     */
    public void iqPoolDelta(iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest request,
        io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIqPoolDeltaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(iq.market.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Swap returns simulated swap amount.
     * </pre>
     */
    public iq.market.v1beta1.QueryOuterClass.QuerySwapResponse swap(iq.market.v1beta1.QueryOuterClass.QuerySwapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IqPoolDelta returns iq_pool_delta amount.
     * </pre>
     */
    public iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse iqPoolDelta(iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIqPoolDeltaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public iq.market.v1beta1.QueryOuterClass.QueryParamsResponse params(iq.market.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Swap returns simulated swap amount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<iq.market.v1beta1.QueryOuterClass.QuerySwapResponse> swap(
        iq.market.v1beta1.QueryOuterClass.QuerySwapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IqPoolDelta returns iq_pool_delta amount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse> iqPoolDelta(
        iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIqPoolDeltaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<iq.market.v1beta1.QueryOuterClass.QueryParamsResponse> params(
        iq.market.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWAP = 0;
  private static final int METHODID_IQ_POOL_DELTA = 1;
  private static final int METHODID_PARAMS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWAP:
          serviceImpl.swap((iq.market.v1beta1.QueryOuterClass.QuerySwapRequest) request,
              (io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QuerySwapResponse>) responseObserver);
          break;
        case METHODID_IQ_POOL_DELTA:
          serviceImpl.iqPoolDelta((iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaRequest) request,
              (io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QueryIqPoolDeltaResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((iq.market.v1beta1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<iq.market.v1beta1.QueryOuterClass.QueryParamsResponse>) responseObserver);
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

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return iq.market.v1beta1.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getSwapMethod())
              .addMethod(getIqPoolDeltaMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
