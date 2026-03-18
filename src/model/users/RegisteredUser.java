package model.users;

import java.security.MessageDigest;
public class RegisteredUser extends GuestUser {
	private String username;
	private String password;

	public RegisteredUser() {
		super();
		username = "DefaultUser";
		setPassword("0000");
	}
	
	public RegisteredUser(String username, String password) {
		super();
		setUsername(username);
		setPassword(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username != null && !username.isEmpty() && username.matches("[A-Za-z0-9]{4,20}")) {
			this.username = username;
		} else {
			username = "DefaultUser";
		}
	}

	public String getPassword() {
		return password;
	}

	//regex maska parolei no: https://uibakery.io/regex-library/password
	public void setPassword(String password) {
		if(password != null && !password.isEmpty() && password.matches("/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/"))
		
		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			this.password = md.digest().toString();
		}
		catch (Exception e) {
			this.password = "0000";
		}
	}
	
	public String toString() {
		String result = id + ": " + username + " " + password;
		return result;
	}
	
	public void login() {
		
	}
	
	public void followPage() {
		
	}
}
