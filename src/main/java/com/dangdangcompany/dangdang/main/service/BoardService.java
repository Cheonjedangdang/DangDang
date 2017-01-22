package com.dangdangcompany.dangdang.main.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dangdangcompany.dangdang.main.dao.BoardDAO;
import com.dangdangcompany.dangdang.main.dto.BoardDTO;
import com.dangdangcompany.dangdang.main.paging.PagingDTO;
import com.dangdangcompany.dangdang.main.vo.BoardVO;

@Service
public class BoardService {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardService.class);
	@Autowired
	private BoardDAO boardDao;
	
	public void boardWrite(BoardVO vo){
		boardDao.insert2(vo);
	}
	public ArrayList<BoardVO> categoryBoard(int boardcategoryId){
		logger.info("{}",boardDao.selectCategory2(boardcategoryId));
		return boardDao.selectCategory2(boardcategoryId);
	}
	public BoardVO contentView(int boardId){
		return boardDao.select(boardId);
	}
	public PagingDTO pageSet(int boardcategoryId, int pageNo){
		PagingDTO pdto = new PagingDTO();
		int num = boardDao.selectCategory2(boardcategoryId).size();	
		if(pageNo==0)
		{
			pdto.setPageNo(1);
		}
		else{
			pdto.setPageNo(pageNo);
		}
		pdto.setPageSize(10);
		pdto.setStartPageNo(1);
		pdto.setEndPageNo(5);
		pdto.setCategoryId(boardcategoryId);
		pdto.setTotalCount(boardDao.selectCategory2(boardcategoryId).size());
		return pdto;
	}
	public ArrayList<BoardVO> p(int boardcategoryId, int pageNo){
		return boardDao.selectpaging(pageSet(boardcategoryId, pageNo));
	}
}
