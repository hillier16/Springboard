package com.tnqls.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnqls.spring.domain.User;
import com.tnqls.spring.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired UserMapper userMapper;
	
	public void createUser(User user) {
		userMapper.createUser(user);
	}
	
	public User getUserById(String userid) {
		User user = userMapper.getUserById(userid);
		return user; 
	}

}
