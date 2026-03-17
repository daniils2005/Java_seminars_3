package model;

import java.time.LocalDateTime;

public class Post {
	private String msg;
	private LocalDateTime datetime;
	private int countOfLikes;
	
	public Post() {
		msg = "";
		datetime = LocalDateTime.now();
		countOfLikes = 0;
	}
	
	public Post(String msg) {
		setMsg(msg);
		datetime = LocalDateTime.now();
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

	public void setDate() {
		datetime = LocalDateTime.now();
	}

	public int getCountOfLikes() {
		return countOfLikes;
	}

	public void incrementCountOfLikes() {
		countOfLikes++;
	}

	@Override
	public String toString() {
		return "Post [msg=" + msg + ", date=" + date + ", countOfLikes=" + countOfLikes + "]";
	}
	
}
