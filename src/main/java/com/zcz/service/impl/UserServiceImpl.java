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

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.findUserById(id);
	}

	@Override
	public boolean updateUserById(User user) {
		// TODO Auto-generated method stub
		userDao.updateUserById(user);
		return true;
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
		return true;
	}

}
