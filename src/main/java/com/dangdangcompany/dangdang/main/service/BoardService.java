package com.dangdangcompany.dangdang.main.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dangdangcompany.dangdang.main.dao.BoardDAO;
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
		pdto.setBlockSize(5);
		pdto.setPageSize(10);
		pdto.setTotalCount(num);
		pdto.setCategoryId(boardcategoryId);
		if(pageNo==0)
		{
			pdto.setPageNo(1);
		} else{
			pdto.setPageNo(pageNo);
		}
		
		if(pdto.getPageNo()%pdto.getBlockSize()==0){
			pdto.setPageGroup(pdto.getPageNo()/pdto.getBlockSize());
		}else{
			pdto.setPageGroup(pdto.getPageNo()/pdto.getBlockSize()+1);
		}
		logger.info("{}", pdto.getPageGroup());
		if(pdto.getPageGroup()==1)
		{
			pdto.setStartPageNo(1);
			if(num/(pdto.getPageSize()*pdto.getBlockSize())==0&&num%pdto.getPageSize()==0){
				pdto.setEndPageNo(num/10);			
			}else if(num/(pdto.getPageSize()*pdto.getBlockSize())==0&&num%pdto.getPageSize()!=0){
				pdto.setEndPageNo(num/10+1);
			}else{
				pdto.setEndPageNo(pdto.getBlockSize());
			}
		}else{
			if(num/(pdto.getPageSize()*pdto.getBlockSize())==pdto.getPageGroup()){
				pdto.setStartPageNo(pdto.getBlockSize()*(pdto.getPageGroup()-1)+1);
				pdto.setEndPageNo(pdto.getBlockSize()*pdto.getPageGroup());
			
			} else if(num/(pdto.getPageSize()*pdto.getBlockSize())==pdto.getPageGroup()&&num/pdto.getPageSize()==0){
				pdto.setStartPageNo(pdto.getBlockSize()*(pdto.getPageGroup()-1)+1);
				pdto.setEndPageNo(pdto.getBlockSize()*pdto.getPageGroup()-(pdto.getBlockSize()*pdto.getPageGroup()-num/pdto.getPageSize()));
			} else{
				pdto.setStartPageNo(pdto.getBlockSize()*(pdto.getPageGroup()-1)+1);
				pdto.setEndPageNo(pdto.getBlockSize()*pdto.getPageGroup()-(pdto.getBlockSize()*pdto.getPageGroup()-num/pdto.getPageSize()+1));
			}
		}		
		return pdto;
	}
	public ArrayList<BoardVO> p(int boardcategoryId, int pageNo){
		return boardDao.selectpaging(pageSet(boardcategoryId, pageNo));
	}
	public void setHit(BoardVO vo){
		boardDao.hitUpdate(vo);
	}
}
