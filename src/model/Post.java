package model;

import java.time.LocalDateTime;

public class Post {
	private String msg;
	private LocalDateTime datetime;
	private int countOfLikes;
	
	public Post() {
		setMsg("Sveiciens!");
		setDateTime();
		countOfLikes = 0;
	}
	
	public Post(String msg) {
		setMsg(msg);
		setDateTime();
		countOfLikes = 0;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		if(msg != null && !msg.isEmpty() && msg.length() < 1000) {
			this.msg = msg;
		} else {
			this.msg = "";
		}
	}

	public LocalDateTime getDate() {
		return datetime;
	}

	public void setDateTime() {
		datetime = LocalDateTime.now();
	}

	public int getCountOfLikes() {
		return countOfLikes;
	}

	public void incrementCountOfLikes() {
		countOfLikes++;
	}

	public String toString() {
		String result = msg + " (" + datetime + "), " + countOfLikes + " patik iezimes";
		return result;
	}
	
}
