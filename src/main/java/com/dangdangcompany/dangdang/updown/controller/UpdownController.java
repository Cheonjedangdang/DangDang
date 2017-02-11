package com.dangdangcompany.dangdang.updown.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dangdangcompany.dangdang.updown.dto.UpdownDTO;
import com.dangdangcompany.dangdang.updown.service.UpdownService;
import com.dangdangcompany.dangdang.utils.json.SimpleHashMap;
@Controller
public class UpdownController {
	
	private static final Logger logger = LoggerFactory.getLogger(UpdownController.class);
	
	@Autowired
	private UpdownService updownService;
	
	@RequestMapping(value="upCount", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> upCount(UpdownDTO dto){
		logger.info("{}", dto.getBoardId());
		logger.info("{}", updownService.up(dto.getBoardId()));
		return SimpleHashMap.newInstance().put("updownCount", updownService.up(dto.getBoardId()));
	}
	@RequestMapping(value="downCount", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> downCount(UpdownDTO dto){
		logger.info("{}", dto.getBoardId());
		logger.info("{}", updownService.down(dto.getBoardId()));
		return SimpleHashMap.newInstance().put("updownCount", updownService.down(dto.getBoardId()));
	}
	
	@RequestMapping(value="btnUp", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> btnUp(UpdownDTO dto){
		logger.info("{}",dto.getUserId()+","+dto.getBoardId());
		logger.info("{}", updownService.boardUp(dto.getUserId(), dto.getBoardId()));
		if(dto.getUserId()==""){
			return SimpleHashMap.newInstance().put("로그인", "x");
		}
		return SimpleHashMap.newInstance().put("updownCount", updownService.boardUp(dto.getUserId(), dto.getBoardId()));
	}
	@RequestMapping(value="btnDown", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> btnDown(UpdownDTO dto){
		logger.info("{}",dto.getUserId()+","+dto.getBoardId());
		if(dto.getUserId()==""){
			return SimpleHashMap.newInstance().put("로그인", "x");
		}
		return SimpleHashMap.newInstance().put("updownCount", updownService.boardDown(dto.getUserId(), dto.getBoardId()));
	}
	
}
