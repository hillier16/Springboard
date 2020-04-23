package com.tnqls.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.tnqls.spring.domain.User;

public interface UserMapper {
	
	void createUser(User user);
	@Select ("SELECT * FROM user WHERE userid = #{userid}")
	User getUserById(String userid);
	List<User> getUserAll = null;
	void updateUser(User user);
	void removeUserById(String userid);
	
}
