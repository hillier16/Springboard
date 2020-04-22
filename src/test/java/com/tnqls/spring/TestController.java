package com.tnqls.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tnqls.spring.service.TestService;

@Controller
public class TestController {

	TestService service = new TestService();

	@Test
	public void selectNow() {
		String result = service.selectNow();
		System.out.println(result);
	}
}
