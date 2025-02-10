package com.foodize.dao;

import java.util.List;

import com.foodize.model.User;

public interface UserDAO {
	
	boolean addUser(User user);
	User getUser(int userId);
	void updateUser(User user);
	void deleteUser(int userId);
	List<User> getAllUsers();
	
}
