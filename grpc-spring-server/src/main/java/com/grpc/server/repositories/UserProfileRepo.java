package com.grpc.server.repositories;

import org.springframework.data.repository.CrudRepository;

import com.grpc.server.entity.UserProfile;

public interface UserProfileRepo extends CrudRepository<UserProfile, Long> {
	public UserProfile findByFullName(String userName);
}
