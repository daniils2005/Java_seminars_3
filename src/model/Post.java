package model;

import java.util.Date;

public class Post {
	private String msg;
	private Date date;
	private int countOfLikes;
	
	public Post() {
		msg = "";
		date = new Date();
		countOfLikes = 0;
	}
	
	public Post(String msg) {
		this.msg = msg;
		date = new Date();
		countOfLikes = 0;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCountOfLikes() {
		return countOfLikes;
	}

	public void setCountOfLikes(int countOfLikes) {
		this.countOfLikes = countOfLikes;
	}

	@Override
	public String toString() {
		return "Post [msg=" + msg + ", date=" + date + ", countOfLikes=" + countOfLikes + "]";
	}
	
}
