package model.users;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import service.IPostPublish;
import service.MainService;

public abstract class RegisteredUser extends GuestUser implements IPostPublish {
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
		if(username != null && !username.isEmpty() && username.matches("[A-Za-z0-9.]{4,20}")) {
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
		if(password != null && !password.isEmpty() && password.matches("[A-Za-z0-9 !@#$%^&*]{1,10}")){
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(password.getBytes());
				this.password = new String(md.digest());
			} catch (Exception e) {
				this.password = "0000";
			}
		} else {
			this.password = "0000";
		}
	}
	
	public String toString() {
		String result = generatedId + ": " + username + " " + password;
		return result;
	}
	
	public boolean login(String inputUsername, String inputPassword) throws NoSuchAlgorithmException {
		for(GuestUser tempU : MainService.getLietotaji()) {
			if(tempU instanceof RegisteredUser) {
				RegisteredUser tempRU = (RegisteredUser)tempU;
				
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(inputPassword.getBytes());
				String inputPasswordEncoded = new String(md.digest());
				
				if(tempRU.getUsername().equals(inputUsername) && tempRU.getPassword().equals(inputPasswordEncoded)) {
					return true;
				}
			}
		}
		return false;
	}
}
