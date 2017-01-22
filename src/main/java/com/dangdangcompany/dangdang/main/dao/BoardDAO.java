package com.dangdangcompany.dangdang.main.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dangdangcompany.dangdang.main.dto.BoardDTO;
import com.dangdangcompany.dangdang.main.paging.PagingDTO;
import com.dangdangcompany.dangdang.main.vo.BoardVO;

@Repository
public interface BoardDAO {
	void insert(BoardDTO board);
	void insert2(BoardVO board);
	BoardVO select(int boardId);
	ArrayList<BoardDTO> selectAll();
	ArrayList<BoardDTO> selectCategory(int boardcategoryId);
	ArrayList<BoardVO> selectCategory2(int boardcategoryId);
	ArrayList<BoardVO> selectpaging(PagingDTO pdto);
}
