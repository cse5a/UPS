/**
 * 
 */
package com.polling.bean;

/**
 * @author USER
 *
 */
public class A_LoginBean {
		
		private String user_first_name;
		private String user_last_name;
		private String email;
		private String password;
		private boolean status;
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public String getUser_first_name() {
			return user_first_name;
		}
		public void setUser_first_name(String user_first_name) {
			this.user_first_name = user_first_name;
		}
		public String getUser_last_name() {
			return user_last_name;
		}
		public void setUser_last_name(String user_last_name) {
			this.user_last_name = user_last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
