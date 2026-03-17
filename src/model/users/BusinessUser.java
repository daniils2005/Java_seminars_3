package model.users;

import java.util.ArrayList;

import model.*;

public class BusinessUser extends RegisteredUser {
	private ArrayList<Page> listOfPages;
	
	BusinessUser(){
		listOfPages = new ArrayList<Page>();
	}
	
	BusinessUser(ArrayList<Page> listOfPages){
		this.listOfPages = listOfPages;
	}

	public ArrayList<Page> getListOfPages() {
		return listOfPages;
	}

	public void setListOfPages(ArrayList<Page> listOfPages) {
		this.listOfPages = listOfPages;
	}

	@Override
	public String toString() {
		return "BusinessUser [generatedId=" + generatedId + "]";
	}
	
	public void createPage() {
		Page newPage = new Page();
		listOfPages.add(newPage);
	}
	
}
