package com.tnqls.spring.dto;

import com.tnqls.spring.domain.User;

public class UserDto {

	private String userid;
	private String password;
	
	
	public static class LoginInfo {
		private String userid;
		private String password;
		
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
}
