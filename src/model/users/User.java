package model.users;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import model.*;

public abstract class User extends GuestUser {
	private String nameAndSurname;
	private String username;
	private String password;
	
	
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

	public User() {
		nameAndSurname = "";
		username = "";
		password = "";
	}
	
	public User(String nameAndSurname, String username, String password) {
		this.nameAndSurname = nameAndSurname;
		this.username = username;
		this.password = getMd5(password);
	}

	public String getNameAndSurname() {
		return nameAndSurname;
	}

	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
