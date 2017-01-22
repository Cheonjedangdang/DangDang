package com.dangdangcompany.dangdang.comment.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dangdangcompany.dangdang.comment.dao.CommentDAO;
import com.dangdangcompany.dangdang.comment.vo.CommentVO;

@Service
public class CommentService {
	@Autowired
	CommentDAO commentDao;
	
	public void insert(CommentVO comment){
		commentDao.insert(comment);
	}
	public ArrayList<CommentVO> select(int boardId){
		return commentDao.select(boardId);
	}
	public CommentVO selectComment(int commentId){
		return commentDao.selectComment(commentId);
	}
	public ArrayList<CommentVO> selectAll(){
		return commentDao.selectAll();
	}
}
