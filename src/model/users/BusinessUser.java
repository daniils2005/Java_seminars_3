package model.users;

import java.util.ArrayList;
import java.util.Random;

import model.Page;
import model.Post;
import model.enums.PostType;

public class BusinessUser extends RegisteredUser {
	private ArrayList<Page> allPages = new ArrayList<Page>();
	
	//setters - nav nepieciesams, jo 
	
	public ArrayList<Page> getAllPages(){
		return allPages;
	}
	
	public BusinessUser() {
		setGeneratedId();
		setUsername("ziedi");
		setPassword("123456");
	}
	
	public BusinessUser(String inputUsername, String inputPassword) {
		super(inputUsername, inputPassword);
	}

	public String toString() {
		return super.toString() + " -> " + allPages;
	}
	
	@Override
	public void createAndPublishPost(String msg, PostType inputPostType) {
		Random rand = new Random();
		allPages.get(rand.nextInt(0, allPages.size())).getAllPostsInPage().add(new Post(msg));
		
	}
	
}
