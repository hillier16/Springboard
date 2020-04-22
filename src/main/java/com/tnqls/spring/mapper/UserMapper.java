package com.tnqls.spring.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.tnqls.spring.domain.User;

@Repository
public interface UserMapper {
	
	void createUser(User user);
	User getUserById(String id);
	List<User> getUserAll = null;
	void updateUser(User user);
	void removeUserById(String id);
	
}
