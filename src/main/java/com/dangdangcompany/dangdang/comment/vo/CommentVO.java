package com.dangdangcompany.dangdang.comment.vo;

import java.sql.Timestamp;

public class CommentVO {
	private int commentId;
	private int boardId;
	private String userId;
	private String content;
	private int up;
	private int down;
	private String nickname;
	private Timestamp time;
	public CommentVO(){}
	public CommentVO(int commentId, int boardId, String userId, String content, int up, int down, String nickname, Timestamp time) {
		super();
		this.commentId = commentId;
		this.boardId = boardId;
		this.userId = userId;
		this.content = content;
		this.up = up;
		this.down = down;
		this.nickname = nickname;
		this.time = time;
	}
	public int getcommentId() {
		return commentId;
	}
	public void setcommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CommentVO [commentId=" + commentId + ", boardId=" + boardId + ", userId=" + userId
				+ ", content=" + content + ", up=" + up + ", down=" + down + ", nickname=" + nickname + ", time=" + time
				+ "]";
	}
}
