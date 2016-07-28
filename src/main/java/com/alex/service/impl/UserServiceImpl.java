package com.alex.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alex.dao.UserDao;
import com.alex.entity.User;
import com.alex.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	//public List<User> userList = getAllUsers();
	
	@Resource
	private UserDao userDao ;
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}

}
