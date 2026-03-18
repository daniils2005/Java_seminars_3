package model.users;

import model.*;

public class GuestUser {
	protected long generatedId;
	private static long counter = 0;

	public GuestUser() {
		setGeneratedId();
	}

	public long getGeneratedId() {
		return generatedId;
	}

	public void setGeneratedId() {
		generatedId = counter++;
	}

	public String toString() {
		String result = "" + generatedId;
		return result;
	}
	
}

