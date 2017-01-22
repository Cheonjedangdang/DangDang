package com.dangdangcompany.dangdang.user.dao;

import org.springframework.stereotype.Repository;

import com.dangdangcompany.dangdang.user.dto.UserDTO;

@Repository
public interface UserDAO {
	void insert(UserDTO user);
	UserDTO selectId(String userId);
	UserDTO selectNickname(String nickname);
	UserDTO login(String userId, String userPw);
}
