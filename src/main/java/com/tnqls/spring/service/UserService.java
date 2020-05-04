package com.tnqls.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnqls.spring.domain.User;
import com.tnqls.spring.dto.UserDto;
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
	
	public int checkId(String userid) {
		User user = userMapper.getUserById(userid);
		if (user == null) {
			return 0;
		}
		return 1;	
	}
	
	public User loginCheck(UserDto.LoginInfo userdto) {
		User user = userMapper.getUserById(userdto.getUserid());
		if(userdto.getPassword().equals(user.getPassword())) {
			return user;
		}
		else {
			return null;
		}
	}
	
	public void deleteUserAll() {
		userMapper.deleteUserAll();
	}
	
	public int getCountUser() {
		return userMapper.getUserCount();
	}

}
