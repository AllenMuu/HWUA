package com.hwua.bin;

public class User {
	private int userId;
	private String userName;
	private String userPassward;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassward() {
		return userPassward;
	}
	public void setUserPassward(String userPassward) {
		this.userPassward = userPassward;
	}
	public User() {
		super();
	}
	public User(int userId, String userName, String userPassward) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassward = userPassward;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassward=" + userPassward + "]";
	}

}
