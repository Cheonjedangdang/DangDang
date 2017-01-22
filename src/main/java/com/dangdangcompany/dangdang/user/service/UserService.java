package com.dangdangcompany.dangdang.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dangdangcompany.dangdang.user.dao.UserDAO;
import com.dangdangcompany.dangdang.user.dto.UserDTO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDao;

	public UserDTO getUserId(String id){
		return userDao.selectId(id);
	}
	public UserDTO getNickname(String nickname){
		return userDao.selectNickname(nickname);
	}
	public boolean CheckId(String userId){
		UserDTO checkId = getUserId(userId);
		if(checkId==null)return true;
		return false;
	}
	public boolean CheckNickname(String nickname){
		UserDTO checkNickname = getNickname(nickname);
		if(checkNickname==null)return true;
		return false;
	}
	public void register(String userId, String userPw, String email, String nickname){
		UserDTO user = new UserDTO();
				user.setUserId(userId);
				user.setUserPw(userPw);
				user.setEmail(email);
				user.setNickname(nickname);
				userDao.insert(user);
	}
	public boolean login(String userId, String userPw){
		UserDTO user = getUserId(userId);
		
		if(user==null)return false;
		
		if(user.getUserPw().equals(userPw))
		{
			return true;
		}
		
		return false;
	}
}
