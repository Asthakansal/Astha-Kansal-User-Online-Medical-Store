package com.medicine.oms.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.medicine.oms.entity.User;

@Service
public interface UserService {

	public User insertUser(User user)throws Exception;
	public List<User> getAllUsers()throws Exception;
	public User getUserByUserName(String username)throws Exception;
	public List<User> getUserByRole(String role)throws Exception;
	public User getUserByUserId(int userId) throws Exception;
	public List<User> getUsersBetweenIds(int range1,int range2)throws Exception;
	public String delete(int id);
	public List<User> FilterByRole(String role)throws Exception;

	

	

	

}