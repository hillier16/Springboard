package com.tnqls.spring;


import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class DataSourceTest {
	
	@Autowired
	private DataSource ds;

	@Test
	public void test() {
		try(Connection con = ds.getConnection()){
			System.out.println("\n >>>>> Connection 출력: " + con + "\n");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
