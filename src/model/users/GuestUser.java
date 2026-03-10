package model.users;

import model.*;

public class GuestUser {
	public int generatedId;
	public static int counter = 1;

	public GuestUser() {
		generatedId = counter;
		counter++;
	}

	public int getGeneratedId() {
		return generatedId;
	}

	public void setGeneratedId(int generatedId) {
		this.generatedId = generatedId;
	}

	@Override
	public String toString() {
		return "GuestUser [generatedId=" + generatedId + "]";
	}
	
}

