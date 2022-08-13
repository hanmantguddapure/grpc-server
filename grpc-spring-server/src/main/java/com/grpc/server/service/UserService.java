
package com.grpc.server.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.grpc.server.entity.UserProfile;
import com.grpc.server.proto.UserDetails;
import com.grpc.server.proto.UserServiceGrpc;
import com.grpc.server.repositories.UserProfileRepo;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Transactional
public class UserService extends UserServiceGrpc.UserServiceImplBase {
	@Autowired
	UserProfileRepo userProfileRepo;

	@Override
	public void searchUser(UserDetails.UserRequest request, StreamObserver<UserDetails.UserResponse> responseObserver) {
		UserProfile userProfile = userProfileRepo.findByFullName(request.getName());
		UserDetails.UserResponse response = UserDetails.UserResponse.newBuilder()
				.setName("Hello " + userProfile.getFullName()).setUserId(String.valueOf(userProfile.getProfileId()))
				.build();
		responseObserver.onNext(response);

		responseObserver.onCompleted();
	}

	@Override
	public void insertRecord(UserDetails.UserRequest request, StreamObserver<UserDetails.Response> responseObserver) {
		userProfileRepo.save(UserProfile.builder().fullName(request.getName()).build());
		UserDetails.Response response = UserDetails.Response.newBuilder()
				.setMessage("Record inserted sucessfully for " + request.getName()).build();
		responseObserver.onNext(response);

		responseObserver.onCompleted();
	}

	@Override
	public void updateRecord(UserDetails.UserRequest request, StreamObserver<UserDetails.Response> responseObserver) {
		UserProfile userProfile = userProfileRepo.findById(Long.valueOf(request.getUserId())).get();
		userProfile.setFullName(request.getName());
		userProfileRepo.save(userProfile);
		UserDetails.Response response = UserDetails.Response.newBuilder()
				.setMessage("Record updated sucessfully " + request.getName()).build();
		responseObserver.onNext(response);

		responseObserver.onCompleted();
	}

}
