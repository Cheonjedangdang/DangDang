package com.dangdangcompany.dangdang.comment.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dangdangcompany.dangdang.comment.service.CommentService;
import com.dangdangcompany.dangdang.comment.vo.CommentVO;
import com.dangdangcompany.dangdang.utils.json.SimpleHashMap;

@Controller
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	private static final Logger logger = LoggerFactory.getLogger(CommentController.class);
	
	@RequestMapping(value="commentc", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> commentc(CommentVO comment){
		CommentVO vo = comment;
		commentService.insert(vo);
		logger.info("{}", vo);
		logger.info("{}", vo.getcommentId());
		return SimpleHashMap.newInstance().put("list", commentService.selectComment(vo.getcommentId()));
	}
	@RequestMapping(value="commentView", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> commentView(CommentVO comment){
		CommentVO vo = comment;
		return SimpleHashMap.newInstance().put("list", commentService.select(vo.getBoardId()));
	}
}
