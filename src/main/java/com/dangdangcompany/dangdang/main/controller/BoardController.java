package com.dangdangcompany.dangdang.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.dangdangcompany.dangdang.main.paging.PagingDTO;
import com.dangdangcompany.dangdang.main.service.BoardService;
import com.dangdangcompany.dangdang.main.vo.BoardVO;
import com.dangdangcompany.dangdang.user.dto.UserDTO;


@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/")
	public String main()
	{
		return "home";
	}
	@RequestMapping("/select")
	public String select()
	{		
		return "select";
	}
	@RequestMapping("home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("menu1")
	public String menu()
	{
		return "board";
	}
	@RequestMapping("write")
	public String write(@RequestParam int categoryId, Model model)
	{
		model.addAttribute("categoryId", categoryId);
		return "write";
	}
	@RequestMapping("boardList")
	public String boardList(PagingDTO pdto, Model model)
	{
	
		model.addAttribute("categoryId", pdto.getCategoryId());
		//model.addAttribute("boardList", boardService.categoryBoard(pdto.getCategoryId()));
		model.addAttribute("pageList", boardService.p(pdto.getCategoryId(), pdto.getPageNo()));
		model.addAttribute("page", boardService.pageSet(pdto.getCategoryId(), pdto.getPageNo()));
		logger.info("{}", pdto.getPageNo());
		return "board";
	}
	@RequestMapping("writec")
	public String writec(BoardVO vo, Model model, @SessionAttribute("user") UserDTO user)
	{
		vo.setUserId(user.getUserId());
		boardService.boardWrite(vo);
		model.addAttribute("boardList", boardService.categoryBoard(vo.getCategoryId()));
		model.addAttribute("categoryId", vo.getCategoryId());
		model.addAttribute("count", boardService.categoryBoard(vo.getCategoryId()).size());
		return "redirect:boardList";
	}
	@RequestMapping("titleClick")
	public String contentView(BoardVO vo, Model model)
	{
		BoardVO selectedVo = boardService.contentView(vo.getBoardId());
		model.addAttribute("boardList", boardService.categoryBoard(selectedVo.getCategoryId()));
		model.addAttribute("list", selectedVo);
		return "contentView";
	}
}
