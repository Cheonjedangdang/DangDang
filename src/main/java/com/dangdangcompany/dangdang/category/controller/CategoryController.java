package com.dangdangcompany.dangdang.category.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dangdangcompany.dangdang.category.service.CategoryService;
import com.dangdangcompany.dangdang.utils.json.SimpleHashMap;

@Controller
public class CategoryController {
private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="comicCategory", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> comicCategory(){		
		logger.info("{}",categoryService.CategoryList());
		return SimpleHashMap.newInstance().put("list", categoryService.CategoryComicList());

	}
	@RequestMapping(value="gameCategory", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> gameCategory(){
		return SimpleHashMap.newInstance().put("list", categoryService.CategoryGameList());
	}
}
