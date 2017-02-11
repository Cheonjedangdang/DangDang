package com.dangdangcompany.dangdang.updown.dto;

public class UpdownDTO {
	private String userId;
	private int boardId;
	private int up;
	private int down;
	
	public UpdownDTO(){}
	public UpdownDTO(String userId, int boardId, int up, int down) {
		super();
		this.userId = userId;
		this.boardId = boardId;
		this.up = up;
		this.down = down;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
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
	@Override
	public String toString() {
		return "UpdownDTO [userId=" + userId + ", boardId=" + boardId + ", up=" + up + ", down=" + down + "]";
	}
}
