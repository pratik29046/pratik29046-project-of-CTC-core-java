package com.cg.smms.service;

import com.cg.smms.entities.User;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
