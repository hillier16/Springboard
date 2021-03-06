package com.tnqls.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnqls.spring.domain.User;
import com.tnqls.spring.mapper.TestMapper;
import com.tnqls.spring.mapper.UserMapper;

@Service
public class TestService {
	
	@Autowired
	private TestMapper mapper;
	
	public String selectNow() {
		return mapper.selectNow();
	}
	
}
