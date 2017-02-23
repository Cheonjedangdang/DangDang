package com.dangdangcompany.dangdang.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.dangdangcompany.dangdang.category.dto.CategoryDTO;
import com.dangdangcompany.dangdang.category.service.CategoryService;
import com.dangdangcompany.dangdang.main.paging.PagingDTO;
import com.dangdangcompany.dangdang.main.service.BoardService;
import com.dangdangcompany.dangdang.main.vo.BoardVO;
import com.dangdangcompany.dangdang.user.dto.UserDTO;


@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * Home View
	 * */
	@RequestMapping(value={"/", "home"}, method=RequestMethod.GET)
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView("home");
		
		mv.addObject("news", null);
		mv.addObject("rank", null);
		mv.addObject("hot", null);
		mv.addObject("best", null);
		
		return mv;
	}
	
	@RequestMapping("/select")
	public String select()
	{		
		return "select";
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
		CategoryDTO categoryDTO = categoryService.getCategoryDetail(pdto.getCategoryId());
		model.addAttribute("category", categoryDTO);
		//model.addAttribute("boardList", boardService.categoryBoard(pdto.getCategoryId()));
		model.addAttribute("pageList", boardService.p(pdto.getCategoryId(), pdto.getPageNo()));
		model.addAttribute("page", boardService.pageSet(pdto.getCategoryId(), pdto.getPageNo()));
		logger.info("{}", pdto.getPageNo());
		return "board";
	}
	@RequestMapping("writec")
	@ResponseBody
	public void writec(BoardVO vo, Model model, @SessionAttribute("user") UserDTO user)
	{
		logger.info("{}", vo);
		vo.setUserId(user.getUserId());
		boardService.boardWrite(vo);
		model.addAttribute("boardList", boardService.categoryBoard(vo.getCategoryId()));
		model.addAttribute("categoryId", vo.getCategoryId());
		model.addAttribute("count", boardService.categoryBoard(vo.getCategoryId()).size());
	}
	
	@RequestMapping("titleClick")
	public String contentView(BoardVO vo, Model model)
	{
		boardService.setHit(vo);
		BoardVO selectedVo = boardService.contentView(vo.getBoardId());
		model.addAttribute("boardList", boardService.categoryBoard(selectedVo.getCategoryId()));
		model.addAttribute("list", selectedVo);
		return "contentView";
	}
}
