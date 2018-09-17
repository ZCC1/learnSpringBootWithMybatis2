package com.zcz.service;

import java.util.List;

import com.zcz.entity.User;

public interface UserService {
	public List<User> getUsers();
	public User findUserById(int id);
	public boolean updateUserById(User user);
	public boolean insertUser(User user);
	public boolean deleteById(int id);
}
