package com.dangdangcompany.dangdang.updown.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dangdangcompany.dangdang.updown.dto.UpdownDTO;

@Repository
public interface UpdownDAO {
	void insert(UpdownDTO board);
	UpdownDTO checkId(String userId, int boardId);
	ArrayList<UpdownDTO> selectAll();
	int upCount(int boardId);
	int downCount(int boardId);
}
