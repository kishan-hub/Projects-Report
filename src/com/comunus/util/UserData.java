package com.comunus.util;

import java.io.Serializable;

public class UserData implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 9047545216263050502L;

    private int userId;
	
	private int id;
	
	private String title;
	
	private String body;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "UserData [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}
