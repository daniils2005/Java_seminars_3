package model.users;

import java.util.ArrayList;

import model.*;
import model.enums.PostType;

public class PrivateUser extends RegisteredUser{
	private ArrayList<Post> allPrivatePosts = new ArrayList<Post>();
	private ArrayList<Post> allPublicPosts = new ArrayList<Post>();
	private ArrayList<RegisteredUser> allMyFollowers = new ArrayList<RegisteredUser>();
	
	public ArrayList<Post> getAllPrivatePosts() {
		return allPrivatePosts;
	}

	public ArrayList<Post> getAllPublicPosts() {
		return allPublicPosts;
	}

	public ArrayList<RegisteredUser> getAllMyFollowers() {
		return allMyFollowers;
	}

	//setteri netiks veidoti, jo nebus iespeja saglabat ieprieks definetus sarakstus ieks si objekta
	
	public PrivateUser() {
		super();//tiek izsaukts registeredUser bezargumenta konstruktors
	}
	
	public PrivateUser(String username, String password) {
		super(username, password);
	}
	
	
	//super.toString() nozime, ka izsauksies RegisteredUser toString funkcija
	public String toString() { 
		String result = super.toString() + "; sludinajumi:\n -> " + allPrivatePosts + "\n -> " + allPublicPosts + ";\n sekotaji -> " + allMyFollowers; 
		return result;
	}


	@Override
	public void createAndPublishPost(String msg, PostType inputPostType) {
		// TODO veikt input parametru parbaudi
		
		if(inputPostType.equals(PostType.privateType)) {
			allPrivatePosts.add(new Post(msg));
		} else if(inputPostType.equals(PostType.publicType)) {
			allPublicPosts.add(new Post(msg));
		}
	}
	
	public void followPrivateUser(RegisteredUser inputUser) {
		//TODO veikt input parametru parabudi
		
		if(!allMyFollowers.contains(inputUser)) {
			allMyFollowers.add(inputUser);
		}
	}
	
}
