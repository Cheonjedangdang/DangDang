package com.dangdangcompany.dangdang.main.vo;

import java.sql.Timestamp;

public class BoardVO {
	private int boardId;
	private int categoryId;
	private String name;
	private String userId;
	private String title;
	private String content;
	private int up;
	private int down;
	private Timestamp time;
	private String nickname;
	private int hit;
	private int comment_cnt;
	public BoardVO(){}
	public BoardVO(int boardId, int categoryId, String userId, String title, String content, int up, int down,
			Timestamp time, String nickname, int hit, String name) {
		super();
		this.boardId = boardId;
		this.categoryId = categoryId;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.up = up;
		this.down = down;
		this.time = time;
		this.nickname = nickname;
		this.hit = hit;
		this.name = name;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public int getDown() {
		return down;
	}
	public void setDown(int down) {
		this.down = down;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getHit(){
		return hit;
	}
	public void setHit(int hit){
		this.hit = hit;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getComment_cnt() {
		return comment_cnt;
	}
	public void setComment_cnt(int comment_cnt) {
		this.comment_cnt = comment_cnt;
	}
	@Override
	public String toString() {
		return "BoardVO [boardId=" + boardId + ", categoryId=" + categoryId + ", name=" + name
				+ ", userId=" + userId + ", title=" + title + ", content=" + content + ", up=" + up + ", down=" + down
				+ ", time=" + time + ", nickname=" + nickname + ", hit=" + hit + "]";
	}
}
