package model.users;

import java.util.ArrayList;

import model.*;

public class PrivateUser extends User{
	private ArrayList<Post> privatePosts;
	private ArrayList<Post> publicPosts;
	private ArrayList<User> followers;
	
	public PrivateUser(){
		privatePosts = new ArrayList<Post>();
		publicPosts = new ArrayList<Post>();
		followers = new ArrayList<User>();
	}
	
	public PrivateUser(ArrayList<Post> privatePosts, ArrayList<Post> publicPosts, ArrayList<User> followers) {
		this.privatePosts = privatePosts;
		this.publicPosts = publicPosts;
		this.followers = followers;
	}

	public ArrayList<Post> getPrivatePosts() {
		return privatePosts;
	}

	public void setPrivatePosts(ArrayList<Post> privatePosts) {
		this.privatePosts = privatePosts;
	}

	public ArrayList<Post> getPublicPosts() {
		return publicPosts;
	}

	public void setPublicPosts(ArrayList<Post> publicPosts) {
		this.publicPosts = publicPosts;
	}

	public ArrayList<User> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}

	@Override
	public String toString() {
		return "PrivateUser [followers=" + followers + "]";
	}
	
	public void followPrivateUser(){
		
	}
}
