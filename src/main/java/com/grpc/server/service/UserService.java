
package com.grpc.server.service;

import io.grpc.stub.StreamObserver;
import com.grpc.server.proto.UserServiceGrpc;
import com.grpc.server.proto.UserDetails;

public class UserService extends UserServiceGrpc.UserServiceImplBase {

	@Override
	public void searchUser(UserDetails.UserRequest request, StreamObserver<UserDetails.UserResponse> responseObserver) {
		UserDetails.UserResponse response = UserDetails.UserResponse.newBuilder().setName("Hello " + request.getName())
				.build();
		responseObserver.onNext(response);

		responseObserver.onCompleted();
	}

	@Override
	public void insertRecord(UserDetails.UserRequest request, StreamObserver<UserDetails.Response> responseObserver) {
		UserDetails.Response response = UserDetails.Response.newBuilder()
				.setMessage("Record inserted sucessfully " + request.getName()).build();
		responseObserver.onNext(response);

		responseObserver.onCompleted();
	}

	@Override
	public void updateRecord(UserDetails.UserRequest request, StreamObserver<UserDetails.Response> responseObserver) {
		UserDetails.Response response = UserDetails.Response.newBuilder()
				.setMessage("Record updated sucessfully " + request.getName()).build();
		responseObserver.onNext(response);

		responseObserver.onCompleted();
	}

}
