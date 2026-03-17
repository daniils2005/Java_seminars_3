package model;

import java.util.ArrayList;

import model.users.*;

public class Page {
	private String title;
	private String description;
	private ArrayList<RegisteredUser> followers;
	private ArrayList<Post> postsInPage;
	
	public Page(){
		title = "";
		description = "";
		followers = new ArrayList<RegisteredUser>();
		postsInPage = new ArrayList<Post>();
	}
	
	public Page(String title, String description) {
		this.title = title;
		this.description = description;
		followers = new ArrayList<RegisteredUser>();
		postsInPage = new ArrayList<Post>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<RegisteredUser> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<RegisteredUser> followers) {
		this.followers = followers;
	}

	public ArrayList<Post> getPostsInPage() {
		return postsInPage;
	}

	public void setPostsInPage(ArrayList<Post> postsInPage) {
		this.postsInPage = postsInPage;
	}

	@Override
	public String toString() {
		return "Page [title=" + title + ", description=" + description + ", followers=" + followers + ", postsInPage=" + postsInPage + "]";
	}

}
