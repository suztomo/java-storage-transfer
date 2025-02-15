/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.storagetransfer.v1.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Storage Transfer Service and its protos.
 * Transfers data between between Google Cloud Storage buckets or from a data
 * source external to Google to a Cloud Storage bucket.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/storagetransfer/v1/transfer.proto")
public final class StorageTransferServiceGrpc {

  private StorageTransferServiceGrpc() {}

  public static final String SERVICE_NAME = "google.storagetransfer.v1.StorageTransferService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest,
          com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>
      getGetGoogleServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGoogleServiceAccount",
      requestType =
          com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest.class,
      responseType = com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest,
          com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>
      getGetGoogleServiceAccountMethod() {
    io.grpc.MethodDescriptor<
            com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest,
            com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>
        getGetGoogleServiceAccountMethod;
    if ((getGetGoogleServiceAccountMethod =
            StorageTransferServiceGrpc.getGetGoogleServiceAccountMethod)
        == null) {
      synchronized (StorageTransferServiceGrpc.class) {
        if ((getGetGoogleServiceAccountMethod =
                StorageTransferServiceGrpc.getGetGoogleServiceAccountMethod)
            == null) {
          StorageTransferServiceGrpc.getGetGoogleServiceAccountMethod =
              getGetGoogleServiceAccountMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.storagetransfer.v1.proto.TransferProto
                              .GetGoogleServiceAccountRequest,
                          com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetGoogleServiceAccount"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .GetGoogleServiceAccountRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StorageTransferServiceMethodDescriptorSupplier(
                              "GetGoogleServiceAccount"))
                      .build();
        }
      }
    }
    return getGetGoogleServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest,
          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
      getCreateTransferJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransferJob",
      requestType =
          com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest.class,
      responseType = com.google.storagetransfer.v1.proto.TransferTypes.TransferJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest,
          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
      getCreateTransferJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest,
            com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
        getCreateTransferJobMethod;
    if ((getCreateTransferJobMethod = StorageTransferServiceGrpc.getCreateTransferJobMethod)
        == null) {
      synchronized (StorageTransferServiceGrpc.class) {
        if ((getCreateTransferJobMethod = StorageTransferServiceGrpc.getCreateTransferJobMethod)
            == null) {
          StorageTransferServiceGrpc.getCreateTransferJobMethod =
              getCreateTransferJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest,
                          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransferJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .CreateTransferJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferTypes.TransferJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StorageTransferServiceMethodDescriptorSupplier("CreateTransferJob"))
                      .build();
        }
      }
    }
    return getCreateTransferJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest,
          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
      getUpdateTransferJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTransferJob",
      requestType =
          com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest.class,
      responseType = com.google.storagetransfer.v1.proto.TransferTypes.TransferJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest,
          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
      getUpdateTransferJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest,
            com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
        getUpdateTransferJobMethod;
    if ((getUpdateTransferJobMethod = StorageTransferServiceGrpc.getUpdateTransferJobMethod)
        == null) {
      synchronized (StorageTransferServiceGrpc.class) {
        if ((getUpdateTransferJobMethod = StorageTransferServiceGrpc.getUpdateTransferJobMethod)
            == null) {
          StorageTransferServiceGrpc.getUpdateTransferJobMethod =
              getUpdateTransferJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest,
                          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTransferJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .UpdateTransferJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferTypes.TransferJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StorageTransferServiceMethodDescriptorSupplier("UpdateTransferJob"))
                      .build();
        }
      }
    }
    return getUpdateTransferJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest,
          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
      getGetTransferJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransferJob",
      requestType = com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest.class,
      responseType = com.google.storagetransfer.v1.proto.TransferTypes.TransferJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest,
          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
      getGetTransferJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest,
            com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
        getGetTransferJobMethod;
    if ((getGetTransferJobMethod = StorageTransferServiceGrpc.getGetTransferJobMethod) == null) {
      synchronized (StorageTransferServiceGrpc.class) {
        if ((getGetTransferJobMethod = StorageTransferServiceGrpc.getGetTransferJobMethod)
            == null) {
          StorageTransferServiceGrpc.getGetTransferJobMethod =
              getGetTransferJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest,
                          com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransferJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .GetTransferJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferTypes.TransferJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StorageTransferServiceMethodDescriptorSupplier("GetTransferJob"))
                      .build();
        }
      }
    }
    return getGetTransferJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest,
          com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>
      getListTransferJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransferJobs",
      requestType = com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest.class,
      responseType =
          com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest,
          com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>
      getListTransferJobsMethod() {
    io.grpc.MethodDescriptor<
            com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest,
            com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>
        getListTransferJobsMethod;
    if ((getListTransferJobsMethod = StorageTransferServiceGrpc.getListTransferJobsMethod)
        == null) {
      synchronized (StorageTransferServiceGrpc.class) {
        if ((getListTransferJobsMethod = StorageTransferServiceGrpc.getListTransferJobsMethod)
            == null) {
          StorageTransferServiceGrpc.getListTransferJobsMethod =
              getListTransferJobsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest,
                          com.google.storagetransfer.v1.proto.TransferProto
                              .ListTransferJobsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransferJobs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .ListTransferJobsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .ListTransferJobsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StorageTransferServiceMethodDescriptorSupplier("ListTransferJobs"))
                      .build();
        }
      }
    }
    return getListTransferJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest,
          com.google.protobuf.Empty>
      getPauseTransferOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseTransferOperation",
      requestType =
          com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest,
          com.google.protobuf.Empty>
      getPauseTransferOperationMethod() {
    io.grpc.MethodDescriptor<
            com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest,
            com.google.protobuf.Empty>
        getPauseTransferOperationMethod;
    if ((getPauseTransferOperationMethod =
            StorageTransferServiceGrpc.getPauseTransferOperationMethod)
        == null) {
      synchronized (StorageTransferServiceGrpc.class) {
        if ((getPauseTransferOperationMethod =
                StorageTransferServiceGrpc.getPauseTransferOperationMethod)
            == null) {
          StorageTransferServiceGrpc.getPauseTransferOperationMethod =
              getPauseTransferOperationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.storagetransfer.v1.proto.TransferProto
                              .PauseTransferOperationRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "PauseTransferOperation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .PauseTransferOperationRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StorageTransferServiceMethodDescriptorSupplier(
                              "PauseTransferOperation"))
                      .build();
        }
      }
    }
    return getPauseTransferOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest,
          com.google.protobuf.Empty>
      getResumeTransferOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeTransferOperation",
      requestType =
          com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest,
          com.google.protobuf.Empty>
      getResumeTransferOperationMethod() {
    io.grpc.MethodDescriptor<
            com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest,
            com.google.protobuf.Empty>
        getResumeTransferOperationMethod;
    if ((getResumeTransferOperationMethod =
            StorageTransferServiceGrpc.getResumeTransferOperationMethod)
        == null) {
      synchronized (StorageTransferServiceGrpc.class) {
        if ((getResumeTransferOperationMethod =
                StorageTransferServiceGrpc.getResumeTransferOperationMethod)
            == null) {
          StorageTransferServiceGrpc.getResumeTransferOperationMethod =
              getResumeTransferOperationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.storagetransfer.v1.proto.TransferProto
                              .ResumeTransferOperationRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ResumeTransferOperation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .ResumeTransferOperationRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StorageTransferServiceMethodDescriptorSupplier(
                              "ResumeTransferOperation"))
                      .build();
        }
      }
    }
    return getResumeTransferOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest,
          com.google.longrunning.Operation>
      getRunTransferJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunTransferJob",
      requestType = com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest,
          com.google.longrunning.Operation>
      getRunTransferJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest,
            com.google.longrunning.Operation>
        getRunTransferJobMethod;
    if ((getRunTransferJobMethod = StorageTransferServiceGrpc.getRunTransferJobMethod) == null) {
      synchronized (StorageTransferServiceGrpc.class) {
        if ((getRunTransferJobMethod = StorageTransferServiceGrpc.getRunTransferJobMethod)
            == null) {
          StorageTransferServiceGrpc.getRunTransferJobMethod =
              getRunTransferJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunTransferJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.storagetransfer.v1.proto.TransferProto
                                  .RunTransferJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StorageTransferServiceMethodDescriptorSupplier("RunTransferJob"))
                      .build();
        }
      }
    }
    return getRunTransferJobMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static StorageTransferServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageTransferServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<StorageTransferServiceStub>() {
          @java.lang.Override
          public StorageTransferServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new StorageTransferServiceStub(channel, callOptions);
          }
        };
    return StorageTransferServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageTransferServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageTransferServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<StorageTransferServiceBlockingStub>() {
          @java.lang.Override
          public StorageTransferServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new StorageTransferServiceBlockingStub(channel, callOptions);
          }
        };
    return StorageTransferServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static StorageTransferServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageTransferServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<StorageTransferServiceFutureStub>() {
          @java.lang.Override
          public StorageTransferServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new StorageTransferServiceFutureStub(channel, callOptions);
          }
        };
    return StorageTransferServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Storage Transfer Service and its protos.
   * Transfers data between between Google Cloud Storage buckets or from a data
   * source external to Google to a Cloud Storage bucket.
   * </pre>
   */
  public abstract static class StorageTransferServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Returns the Google service account that is used by Storage Transfer
     * Service to access buckets in the project where transfers
     * run or in other projects. Each Google service account is associated
     * with one Google Cloud Platform Console project. Users
     * should add this service account to the Google Cloud Storage bucket
     * ACLs to grant access to Storage Transfer Service. This service
     * account is created and owned by Storage Transfer Service and can
     * only be used by Storage Transfer Service.
     * </pre>
     */
    public void getGoogleServiceAccount(
        com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest request,
        io.grpc.stub.StreamObserver<
                com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetGoogleServiceAccountMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a transfer job that runs periodically.
     * </pre>
     */
    public void createTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateTransferJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a transfer job. Updating a job's transfer spec does not affect
     * transfer operations that are running already.
     * **Note:** The job's [status][google.storagetransfer.v1.TransferJob.status]
     * field can be modified using this RPC (for example, to set a job's status to
     * [DELETED][google.storagetransfer.v1.TransferJob.Status.DELETED],
     * [DISABLED][google.storagetransfer.v1.TransferJob.Status.DISABLED], or
     * [ENABLED][google.storagetransfer.v1.TransferJob.Status.ENABLED]).
     * </pre>
     */
    public void updateTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateTransferJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a transfer job.
     * </pre>
     */
    public void getTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetTransferJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists transfer jobs.
     * </pre>
     */
    public void listTransferJobs(
        com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListTransferJobsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pauses a transfer operation.
     * </pre>
     */
    public void pauseTransferOperation(
        com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getPauseTransferOperationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Resumes a transfer operation that is paused.
     * </pre>
     */
    public void resumeTransferOperation(
        com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getResumeTransferOperationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Attempts to start a new TransferOperation for the current TransferJob. A
     * TransferJob has a maximum of one active TransferOperation. If this method
     * is called while a TransferOperation is active, an error wil be returned.
     * </pre>
     */
    public void runTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getRunTransferJobMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getGetGoogleServiceAccountMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.storagetransfer.v1.proto.TransferProto
                          .GetGoogleServiceAccountRequest,
                      com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>(
                      this, METHODID_GET_GOOGLE_SERVICE_ACCOUNT)))
          .addMethod(
              getCreateTransferJobMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest,
                      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>(
                      this, METHODID_CREATE_TRANSFER_JOB)))
          .addMethod(
              getUpdateTransferJobMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest,
                      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>(
                      this, METHODID_UPDATE_TRANSFER_JOB)))
          .addMethod(
              getGetTransferJobMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest,
                      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>(
                      this, METHODID_GET_TRANSFER_JOB)))
          .addMethod(
              getListTransferJobsMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest,
                      com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>(
                      this, METHODID_LIST_TRANSFER_JOBS)))
          .addMethod(
              getPauseTransferOperationMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.storagetransfer.v1.proto.TransferProto
                          .PauseTransferOperationRequest,
                      com.google.protobuf.Empty>(this, METHODID_PAUSE_TRANSFER_OPERATION)))
          .addMethod(
              getResumeTransferOperationMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.storagetransfer.v1.proto.TransferProto
                          .ResumeTransferOperationRequest,
                      com.google.protobuf.Empty>(this, METHODID_RESUME_TRANSFER_OPERATION)))
          .addMethod(
              getRunTransferJobMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest,
                      com.google.longrunning.Operation>(this, METHODID_RUN_TRANSFER_JOB)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Storage Transfer Service and its protos.
   * Transfers data between between Google Cloud Storage buckets or from a data
   * source external to Google to a Cloud Storage bucket.
   * </pre>
   */
  public static final class StorageTransferServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StorageTransferServiceStub> {
    private StorageTransferServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTransferServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageTransferServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns the Google service account that is used by Storage Transfer
     * Service to access buckets in the project where transfers
     * run or in other projects. Each Google service account is associated
     * with one Google Cloud Platform Console project. Users
     * should add this service account to the Google Cloud Storage bucket
     * ACLs to grant access to Storage Transfer Service. This service
     * account is created and owned by Storage Transfer Service and can
     * only be used by Storage Transfer Service.
     * </pre>
     */
    public void getGoogleServiceAccount(
        com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest request,
        io.grpc.stub.StreamObserver<
                com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGoogleServiceAccountMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a transfer job that runs periodically.
     * </pre>
     */
    public void createTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransferJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a transfer job. Updating a job's transfer spec does not affect
     * transfer operations that are running already.
     * **Note:** The job's [status][google.storagetransfer.v1.TransferJob.status]
     * field can be modified using this RPC (for example, to set a job's status to
     * [DELETED][google.storagetransfer.v1.TransferJob.Status.DELETED],
     * [DISABLED][google.storagetransfer.v1.TransferJob.Status.DISABLED], or
     * [ENABLED][google.storagetransfer.v1.TransferJob.Status.ENABLED]).
     * </pre>
     */
    public void updateTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTransferJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a transfer job.
     * </pre>
     */
    public void getTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransferJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists transfer jobs.
     * </pre>
     */
    public void listTransferJobs(
        com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransferJobsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pauses a transfer operation.
     * </pre>
     */
    public void pauseTransferOperation(
        com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseTransferOperationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Resumes a transfer operation that is paused.
     * </pre>
     */
    public void resumeTransferOperation(
        com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeTransferOperationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Attempts to start a new TransferOperation for the current TransferJob. A
     * TransferJob has a maximum of one active TransferOperation. If this method
     * is called while a TransferOperation is active, an error wil be returned.
     * </pre>
     */
    public void runTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRunTransferJobMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Storage Transfer Service and its protos.
   * Transfers data between between Google Cloud Storage buckets or from a data
   * source external to Google to a Cloud Storage bucket.
   * </pre>
   */
  public static final class StorageTransferServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StorageTransferServiceBlockingStub> {
    private StorageTransferServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTransferServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageTransferServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns the Google service account that is used by Storage Transfer
     * Service to access buckets in the project where transfers
     * run or in other projects. Each Google service account is associated
     * with one Google Cloud Platform Console project. Users
     * should add this service account to the Google Cloud Storage bucket
     * ACLs to grant access to Storage Transfer Service. This service
     * account is created and owned by Storage Transfer Service and can
     * only be used by Storage Transfer Service.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount
        getGoogleServiceAccount(
            com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest
                request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGoogleServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a transfer job that runs periodically.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferTypes.TransferJob createTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransferJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a transfer job. Updating a job's transfer spec does not affect
     * transfer operations that are running already.
     * **Note:** The job's [status][google.storagetransfer.v1.TransferJob.status]
     * field can be modified using this RPC (for example, to set a job's status to
     * [DELETED][google.storagetransfer.v1.TransferJob.Status.DELETED],
     * [DISABLED][google.storagetransfer.v1.TransferJob.Status.DISABLED], or
     * [ENABLED][google.storagetransfer.v1.TransferJob.Status.ENABLED]).
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferTypes.TransferJob updateTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTransferJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a transfer job.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferTypes.TransferJob getTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransferJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists transfer jobs.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse
        listTransferJobs(
            com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransferJobsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Pauses a transfer operation.
     * </pre>
     */
    public com.google.protobuf.Empty pauseTransferOperation(
        com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseTransferOperationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Resumes a transfer operation that is paused.
     * </pre>
     */
    public com.google.protobuf.Empty resumeTransferOperation(
        com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeTransferOperationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Attempts to start a new TransferOperation for the current TransferJob. A
     * TransferJob has a maximum of one active TransferOperation. If this method
     * is called while a TransferOperation is active, an error wil be returned.
     * </pre>
     */
    public com.google.longrunning.Operation runTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunTransferJobMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Storage Transfer Service and its protos.
   * Transfers data between between Google Cloud Storage buckets or from a data
   * source external to Google to a Cloud Storage bucket.
   * </pre>
   */
  public static final class StorageTransferServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StorageTransferServiceFutureStub> {
    private StorageTransferServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTransferServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageTransferServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns the Google service account that is used by Storage Transfer
     * Service to access buckets in the project where transfers
     * run or in other projects. Each Google service account is associated
     * with one Google Cloud Platform Console project. Users
     * should add this service account to the Google Cloud Storage bucket
     * ACLs to grant access to Storage Transfer Service. This service
     * account is created and owned by Storage Transfer Service and can
     * only be used by Storage Transfer Service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>
        getGoogleServiceAccount(
            com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest
                request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGoogleServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a transfer job that runs periodically.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
        createTransferJob(
            com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransferJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a transfer job. Updating a job's transfer spec does not affect
     * transfer operations that are running already.
     * **Note:** The job's [status][google.storagetransfer.v1.TransferJob.status]
     * field can be modified using this RPC (for example, to set a job's status to
     * [DELETED][google.storagetransfer.v1.TransferJob.Status.DELETED],
     * [DISABLED][google.storagetransfer.v1.TransferJob.Status.DISABLED], or
     * [ENABLED][google.storagetransfer.v1.TransferJob.Status.ENABLED]).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
        updateTransferJob(
            com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTransferJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a transfer job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>
        getTransferJob(
            com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransferJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists transfer jobs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>
        listTransferJobs(
            com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransferJobsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Pauses a transfer operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        pauseTransferOperation(
            com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest
                request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseTransferOperationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Resumes a transfer operation that is paused.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        resumeTransferOperation(
            com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest
                request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeTransferOperationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Attempts to start a new TransferOperation for the current TransferJob. A
     * TransferJob has a maximum of one active TransferOperation. If this method
     * is called while a TransferOperation is active, an error wil be returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        runTransferJob(
            com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRunTransferJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GOOGLE_SERVICE_ACCOUNT = 0;
  private static final int METHODID_CREATE_TRANSFER_JOB = 1;
  private static final int METHODID_UPDATE_TRANSFER_JOB = 2;
  private static final int METHODID_GET_TRANSFER_JOB = 3;
  private static final int METHODID_LIST_TRANSFER_JOBS = 4;
  private static final int METHODID_PAUSE_TRANSFER_OPERATION = 5;
  private static final int METHODID_RESUME_TRANSFER_OPERATION = 6;
  private static final int METHODID_RUN_TRANSFER_JOB = 7;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageTransferServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageTransferServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GOOGLE_SERVICE_ACCOUNT:
          serviceImpl.getGoogleServiceAccount(
              (com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>)
                  responseObserver);
          break;
        case METHODID_CREATE_TRANSFER_JOB:
          serviceImpl.createTransferJob(
              (com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>)
                  responseObserver);
          break;
        case METHODID_UPDATE_TRANSFER_JOB:
          serviceImpl.updateTransferJob(
              (com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>)
                  responseObserver);
          break;
        case METHODID_GET_TRANSFER_JOB:
          serviceImpl.getTransferJob(
              (com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>)
                  responseObserver);
          break;
        case METHODID_LIST_TRANSFER_JOBS:
          serviceImpl.listTransferJobs(
              (com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>)
                  responseObserver);
          break;
        case METHODID_PAUSE_TRANSFER_OPERATION:
          serviceImpl.pauseTransferOperation(
              (com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest)
                  request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESUME_TRANSFER_OPERATION:
          serviceImpl.resumeTransferOperation(
              (com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest)
                  request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RUN_TRANSFER_JOB:
          serviceImpl.runTransferJob(
              (com.google.storagetransfer.v1.proto.TransferProto.RunTransferJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private abstract static class StorageTransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageTransferServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.storagetransfer.v1.proto.TransferProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageTransferService");
    }
  }

  private static final class StorageTransferServiceFileDescriptorSupplier
      extends StorageTransferServiceBaseDescriptorSupplier {
    StorageTransferServiceFileDescriptorSupplier() {}
  }

  private static final class StorageTransferServiceMethodDescriptorSupplier
      extends StorageTransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageTransferServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageTransferServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new StorageTransferServiceFileDescriptorSupplier())
                      .addMethod(getGetGoogleServiceAccountMethod())
                      .addMethod(getCreateTransferJobMethod())
                      .addMethod(getUpdateTransferJobMethod())
                      .addMethod(getGetTransferJobMethod())
                      .addMethod(getListTransferJobsMethod())
                      .addMethod(getPauseTransferOperationMethod())
                      .addMethod(getResumeTransferOperationMethod())
                      .addMethod(getRunTransferJobMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
