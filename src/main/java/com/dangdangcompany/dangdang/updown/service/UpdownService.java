package com.dangdangcompany.dangdang.updown.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dangdangcompany.dangdang.updown.dao.UpdownDAO;
import com.dangdangcompany.dangdang.updown.dto.UpdownDTO;

@Service
public class UpdownService {
	
	@Autowired
	private UpdownDAO updownDao;
	
	public int up(int boardId){
		return updownDao.upCount(boardId);
	}
	public int down(int boardId){
		return updownDao.downCount(boardId);
	}
	
	public int boardUp(String userId, int boardId){
		if(updownDao.checkId(userId, boardId)==null){
			UpdownDTO dto = new UpdownDTO();
			dto.setBoardId(boardId);
			dto.setUserId(userId);
			dto.setUp(1);
			dto.setDown(0);
			updownDao.insert(dto);
			return updownDao.upCount(boardId);
		}
		return updownDao.upCount(boardId);
	}
	public int boardDown(String userId, int boardId){
		if(updownDao.checkId(userId, boardId)==null){
			UpdownDTO dto = new UpdownDTO();
			dto.setBoardId(boardId);
			dto.setUserId(userId);
			dto.setUp(0);
			dto.setDown(1);
			updownDao.insert(dto);
			return updownDao.downCount(boardId);
		}
		return updownDao.downCount(boardId);
	}
}
