package com.dangdangcompany.dangdang.category.dto;

public class CategoryDTO {
	private int boardcategoryId;
	private String name;
	private int type;
	public CategoryDTO(){}
	public CategoryDTO(int boardcategoryId, String name, int type) {
		super();
		this.boardcategoryId = boardcategoryId;
		this.name = name;
		this.type = type;
	}
	public int getBoardcategoryId() {
		return boardcategoryId;
	}
	public void setBoardcategoryId(int boardcategoryId) {
		this.boardcategoryId = boardcategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CategoryDTO [boardcategoryId=" + boardcategoryId + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
