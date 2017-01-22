package com.dangdangcompany.dangdang.main.dto;

import java.sql.Timestamp;

public class BoardDTO {
	private int boardId;
	private int categoryId;
	private String userId;
	private int commentId;
	private int fileId;
	private String title;
	private String content;
	private int up;
	private int down;
	private Timestamp time;
	private String nickname;
	public BoardDTO(){}
	public BoardDTO(int boardId, int categoryId, String userId, int commentId, int fileId, String title,
			String content, int up, int down, Timestamp time, String nickname) {
		super();
		this.boardId = boardId;
		this.categoryId = categoryId;
		this.userId = userId;
		this.commentId = commentId;
		this.fileId = fileId;
		this.title = title;
		this.content = content;
		this.up = up;
		this.down = down;
		this.time = time;
		this.nickname = nickname;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getcategoryId() {
		return categoryId;
	}
	public void setcategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getcommentId() {
		return commentId;
	}
	public void setcommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
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
	@Override
	public String toString() {
		return "BoardDTO [boardId=" + boardId + ", categoryId=" + categoryId + ", userId=" + userId + ", commentId="
				+ commentId + ", fileId=" + fileId + ", title=" + title + ", content=" + content + ", up=" + up
				+ ", down=" + down + ", time=" + time + "]";
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
