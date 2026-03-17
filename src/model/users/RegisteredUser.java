package model.users;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import model.*;

public abstract class RegisteredUser extends GuestUser {
	private String username;
	private String password;
	private String title; //privatajam lietotajam vards un uzvards, biznesa lietotajam - kompanijas nosaukums
	
	//https://www.geeksforgeeks.org/java/md5-hash-in-java/
    public static String getMd5(String input)
    {
        try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

	public RegisteredUser() {
		title = "";
		username = "";
		password = "";
	}
	
	public RegisteredUser(String nameAndSurname, String username, String password) {
		this.nameAndSurname = nameAndSurname;
		this.username = username;
		this.password = getMd5(password);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title != null && !title.isEmpty() && title.matches("[A-Za-z0-9]{4,20}")) {
			this.title = title;
		} else {
			titl
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username != null && !username.isEmpty() && username.matches("[A-Za-z0-9]{4,20}")) {
			this.username = username;
		} else {
			username = "";
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = getMd5(password);
	}

	@Override
	public String toString() {
		return "User [nameAndSurname=" + nameAndSurname + ", username=" + username + ", password=" + password + ", generatedId=" + generatedId + "]";
	}
	
	public void login() {
		
	}
	
	public void followPage() {
		
	}
}
