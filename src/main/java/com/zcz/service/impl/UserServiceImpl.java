package com.zcz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcz.dao.UserDao;
import com.zcz.entity.User;
import com.zcz.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

}
