package com.dangdangcompany.dangdang.user.dto;

public class UserDTO {
	private String userId;
	private String userPw;
	private String email;
	private String nickname;
	private String userPost;
	
	public UserDTO(){}
	public UserDTO(String userId, String userPw, String email, String phone, String nickname,
			String userPost) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.email = email;
		this.nickname = nickname;
		this.userPost = userPost;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUserPost() {
		return userPost;
	}
	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userPw=" + userPw + ", email=" + email + ", nickname=" + nickname
				+ ", userPost=" + userPost + "]";
	}

}
