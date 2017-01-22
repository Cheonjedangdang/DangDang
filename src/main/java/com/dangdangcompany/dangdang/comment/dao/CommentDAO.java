package com.dangdangcompany.dangdang.comment.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dangdangcompany.dangdang.comment.vo.CommentVO;

@Repository
public interface CommentDAO {
	void insert(CommentVO comment);
	ArrayList<CommentVO> select(int boardId);
	ArrayList<CommentVO> selectAll();
	CommentVO selectComment(int commentId);
}
