package com.zcz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zcz.entity.User;
import com.zcz.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@RequestMapping("/addUser")
	public void addUser(HttpServletRequest request) {
		String name = request.getParameter("name");
		User user = new User();
		user.setName(name);
		userService.insertUser(user);
	}
	@RequestMapping("/updateUser")
	public void updateUser(HttpServletRequest request) {
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		User user = new User();
		user.setName(name);
		user.setId(id);
		userService.updateUserById(user);
	}
	
	@RequestMapping("/getUserOne")
	public User getUserOne(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		return userService.findUserById(id);
	}
	@RequestMapping("/deleteUser")
	public void deleteUser(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		userService.deleteById(id);
	}
}
