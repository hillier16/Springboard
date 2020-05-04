package com.tnqls.spring;

import java.sql.Connection;
import java.util.Date;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import com.tnqls.spring.domain.User;
import com.tnqls.spring.dto.UserDto;
import com.tnqls.spring.service.UserService;


@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml", "file:src/test/**/test-context.xml" })
public class UserTest {
	@Autowired
	private ApplicationContext context;
	@Autowired
	private UserService userService;
	User user1;
	
	@Autowired
	private DataSource ds;

	@Before
	public void setup() {
		user1 = new User();
		user1.setUserid("테스트아이디입니다");
		user1.setPassword("테스트비밀번호");
		user1.setUsername("테스트이름");
	}
	
	@Test
	public void deleteUserAllTest() {
		userService.deleteUserAll();
		Assert.assertEquals(userService.getCountUser(), 0);
	}
	
	@Test
	public void createAndGetUserTest() {
		userService.deleteUserAll();
		userService.createUser(user1);
		Assert.assertEquals(userService.getCountUser(), 1);
		User userget1 = userService.getUserById(user1.getUserid());
		checkSameUser(user1, userget1);
	}
	
	private void checkSameUser(User user1, User user2){
		Assert.assertEquals(user1.getUserid(), user2.getUserid());
		Assert.assertEquals(user1.getUsername(), user2.getUsername());
		Assert.assertEquals(user1.getPassword(), user2.getPassword());
	}
	
	@Test
	public void loginCheckTest() {
		userService.createUser(user1);
		UserDto.LoginInfo userdto1 = new UserDto.LoginInfo();
		userdto1.setUserid(user1.getUserid());
		userdto1.setPassword(user1.getPassword());
		checkSameUser(user1, userService.loginCheck(userdto1));
		
		userdto1.setPassword(user1.getPassword() + "p");
		Assert.assertEquals(null, userService.loginCheck(userdto1));
	}

}
