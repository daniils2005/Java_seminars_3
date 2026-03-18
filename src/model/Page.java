package model;

import java.util.ArrayList;

import model.users.RegisteredUser;

public class Page {
	private String title;
	private String description;
	private ArrayList<RegisteredUser> allPageFollowers = new ArrayList<RegisteredUser>();
	private ArrayList<Post> allPostsInPage = new ArrayList<Post>();
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public ArrayList<RegisteredUser> getAllPageFollowers() {
		return allPageFollowers;
	}
	
	public ArrayList<Post> getAllPostsInPage() {
		return allPostsInPage;
	}

	public void setTitle(String title) {
		if(title != null && !title.isEmpty() && title.matches("[A-Z]{1}[a-zA-Z0-9 .,]{3,30}")){
			this.title = title;
		} else {
			title = "Unknown";
		}
	}

	public void setDescription(String description) {
		if(description != null && !description.isEmpty() && description.matches("[A-Z]{1}[a-zA-Z0-9 .,]{3,100}")){
			this.description = description;
		} else {
			description = "Unknown";
		}
	}
	
	public Page() {
		title = "Noklusejuma lapa";
		description = "Lapa par neko";
	}
	
	public Page(String inputTitle, String inputDescription) {
		setTitle(inputTitle);
		setDescription(inputDescription);
	}
	
	public String toString() {
		String result = title + " " + description + "; sludinajumi\n -> " + allPostsInPage + "\n sekotaji: " + allPageFollowers;
		return result;
	}
}
