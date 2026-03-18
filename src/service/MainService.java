package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.enums.PostType;
import model.users.*;


public class MainService {
	
	private static ArrayList<GuestUser> lietotaji = new ArrayList<GuestUser>();

	public static void main(String[] args) {
		GuestUser u1 = new GuestUser();
		PrivateUser u2 = new PrivateUser();
		PrivateUser u3 = new PrivateUser("janis.berzins", "12qwAS!@");
		lietotaji.addAll(Arrays.asList(u1, u2, u3));
		System.out.println(lietotaji);
		
		try {
			if(u2.login("DefaultUser", "0000")) {
				u2.createAndPublishPost("Sveiciens JAVA nodarbiba!", PostType.publicType);
				u2.createAndPublishPost("Man loti patik JAVA!", PostType.publicType);
				u2.createAndPublishPost("Man sodien ir dzimsanas diena", PostType.privateType);
				System.out.println("---------------------------------------------------");
				u2.followPrivateUser(u3);
				System.out.println(lietotaji);
			} else {
				System.out.println("Nav pareizs lietotajvards un/vai parole");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static ArrayList<GuestUser> getLietotaji() {
		return lietotaji;
	}

	
	
}
