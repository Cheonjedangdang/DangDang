package com.dangdangcompany.dangdang.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dangdangcompany.dangdang.user.dto.UserDTO;
import com.dangdangcompany.dangdang.user.service.UserService;
import com.dangdangcompany.dangdang.utils.json.SimpleHashMap;

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/regist")
	public String sign(){		
		return "regist";
	}
	
	@RequestMapping(value="ajaxJoin", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> regist(@RequestParam Map<String,String> data){
		boolean result = true;
		userService.register(	data.get("userId"),
								data.get("userPw"), 
							 	data.get("email"), 
							 	data.get("nickname"));						
		return SimpleHashMap.newInstance().put("result", result);
	}
	@RequestMapping(value="ajaxCheckId", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> checkId(@RequestParam Map<String,String> data){
		boolean result = userService.CheckId(data.get("userId"));
		
		return SimpleHashMap.newInstance().put("result", result);
	}
	@RequestMapping(value="ajaxCheckNickname", method= RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> checkNickname(@RequestParam Map<String,String> data){
		boolean result = userService.CheckNickname(data.get("nickname"));
		logger.info("{}", data);
		return SimpleHashMap.newInstance().put("result", result);
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> login(UserDTO user, HttpSession hs)
	{
		boolean result = false;
		result = userService.login(user.getUserId(), user.getUserPw());

		if(result)
		{
			hs.setAttribute("user", userService.getUserId(user.getUserId()));
		}
		
		return SimpleHashMap.newInstance().put("result", result);
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession hs){
		hs.invalidate();
		return "home";
	}
}
