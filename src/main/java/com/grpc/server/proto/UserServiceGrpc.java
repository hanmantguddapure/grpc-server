package com.grpc.server.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: UserDetails.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest,
      com.grpc.server.proto.UserDetails.UserResponse> getSearchUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUser",
      requestType = com.grpc.server.proto.UserDetails.UserRequest.class,
      responseType = com.grpc.server.proto.UserDetails.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest,
      com.grpc.server.proto.UserDetails.UserResponse> getSearchUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest, com.grpc.server.proto.UserDetails.UserResponse> getSearchUserMethod;
    if ((getSearchUserMethod = UserServiceGrpc.getSearchUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSearchUserMethod = UserServiceGrpc.getSearchUserMethod) == null) {
          UserServiceGrpc.getSearchUserMethod = getSearchUserMethod = 
              io.grpc.MethodDescriptor.<com.grpc.server.proto.UserDetails.UserRequest, com.grpc.server.proto.UserDetails.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "SearchUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.server.proto.UserDetails.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.server.proto.UserDetails.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SearchUser"))
                  .build();
          }
        }
     }
     return getSearchUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest,
      com.grpc.server.proto.UserDetails.Response> getInsertRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertRecord",
      requestType = com.grpc.server.proto.UserDetails.UserRequest.class,
      responseType = com.grpc.server.proto.UserDetails.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest,
      com.grpc.server.proto.UserDetails.Response> getInsertRecordMethod() {
    io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest, com.grpc.server.proto.UserDetails.Response> getInsertRecordMethod;
    if ((getInsertRecordMethod = UserServiceGrpc.getInsertRecordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getInsertRecordMethod = UserServiceGrpc.getInsertRecordMethod) == null) {
          UserServiceGrpc.getInsertRecordMethod = getInsertRecordMethod = 
              io.grpc.MethodDescriptor.<com.grpc.server.proto.UserDetails.UserRequest, com.grpc.server.proto.UserDetails.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "InsertRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.server.proto.UserDetails.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.server.proto.UserDetails.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("InsertRecord"))
                  .build();
          }
        }
     }
     return getInsertRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest,
      com.grpc.server.proto.UserDetails.Response> getUpdateRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRecord",
      requestType = com.grpc.server.proto.UserDetails.UserRequest.class,
      responseType = com.grpc.server.proto.UserDetails.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest,
      com.grpc.server.proto.UserDetails.Response> getUpdateRecordMethod() {
    io.grpc.MethodDescriptor<com.grpc.server.proto.UserDetails.UserRequest, com.grpc.server.proto.UserDetails.Response> getUpdateRecordMethod;
    if ((getUpdateRecordMethod = UserServiceGrpc.getUpdateRecordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateRecordMethod = UserServiceGrpc.getUpdateRecordMethod) == null) {
          UserServiceGrpc.getUpdateRecordMethod = getUpdateRecordMethod = 
              io.grpc.MethodDescriptor.<com.grpc.server.proto.UserDetails.UserRequest, com.grpc.server.proto.UserDetails.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "UpdateRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.server.proto.UserDetails.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.server.proto.UserDetails.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateRecord"))
                  .build();
          }
        }
     }
     return getUpdateRecordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchUser(com.grpc.server.proto.UserDetails.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchUserMethod(), responseObserver);
    }

    /**
     */
    public void insertRecord(com.grpc.server.proto.UserDetails.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertRecordMethod(), responseObserver);
    }

    /**
     */
    public void updateRecord(com.grpc.server.proto.UserDetails.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRecordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.server.proto.UserDetails.UserRequest,
                com.grpc.server.proto.UserDetails.UserResponse>(
                  this, METHODID_SEARCH_USER)))
          .addMethod(
            getInsertRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.server.proto.UserDetails.UserRequest,
                com.grpc.server.proto.UserDetails.Response>(
                  this, METHODID_INSERT_RECORD)))
          .addMethod(
            getUpdateRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.server.proto.UserDetails.UserRequest,
                com.grpc.server.proto.UserDetails.Response>(
                  this, METHODID_UPDATE_RECORD)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchUser(com.grpc.server.proto.UserDetails.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertRecord(com.grpc.server.proto.UserDetails.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRecord(com.grpc.server.proto.UserDetails.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRecordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.server.proto.UserDetails.UserResponse searchUser(com.grpc.server.proto.UserDetails.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.server.proto.UserDetails.Response insertRecord(com.grpc.server.proto.UserDetails.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getInsertRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.server.proto.UserDetails.Response updateRecord(com.grpc.server.proto.UserDetails.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRecordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.server.proto.UserDetails.UserResponse> searchUser(
        com.grpc.server.proto.UserDetails.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.server.proto.UserDetails.Response> insertRecord(
        com.grpc.server.proto.UserDetails.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.server.proto.UserDetails.Response> updateRecord(
        com.grpc.server.proto.UserDetails.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_USER = 0;
  private static final int METHODID_INSERT_RECORD = 1;
  private static final int METHODID_UPDATE_RECORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_USER:
          serviceImpl.searchUser((com.grpc.server.proto.UserDetails.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.UserResponse>) responseObserver);
          break;
        case METHODID_INSERT_RECORD:
          serviceImpl.insertRecord((com.grpc.server.proto.UserDetails.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.Response>) responseObserver);
          break;
        case METHODID_UPDATE_RECORD:
          serviceImpl.updateRecord((com.grpc.server.proto.UserDetails.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.server.proto.UserDetails.Response>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.server.proto.UserDetails.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getSearchUserMethod())
              .addMethod(getInsertRecordMethod())
              .addMethod(getUpdateRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
