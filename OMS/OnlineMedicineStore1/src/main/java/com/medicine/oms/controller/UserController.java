package com.medicine.oms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.oms.entity.User;
import com.medicine.oms.service.UserService;
import java.util.List;


@RestController
@RequestMapping("/medicalstore/user")
@Validated
public class UserController {

	@Autowired
	UserService userService;

	public UserController() {
		System.out.println("\n\n\n====>> Inside Constructor " + this);
	}

	@PostMapping("/adduser")
	public ResponseEntity<String> addUser(@RequestBody  @Validated User user) {
		try {
			User savedUser = userService.insertUser(user);
			String responseMsg = savedUser.getUserName() + " save with Id " + savedUser.getUserId();
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg = "Contact to customer care 1800-250-960 or mail us :- care@travel.com";
			return new ResponseEntity<String>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/userid/{searchUserId}")
	public String deleteUser(@PathVariable int searchUserId)
	{
		try {
			userService.delete(searchUserId);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "deleted successfully";
	}
	
	@PutMapping("/userid/{userId}")
    public   User updateUser(@PathVariable int userId, @RequestBody User userDetails) throws Exception {
        userService.getUserByUserId(userId);
        userDetails.setUserId(userId);
        User updateUser = userService.insertUser(userDetails);
        return updateUser;
    }
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{

		try {
			List<User>  allExtractedUsers = userService.getAllUsers();
			
			return allExtractedUsers;
			
		} catch (Exception e) {
		
			System.out.println(e);
			
		}
		
		return null;
	}
	@GetMapping("username/{searchUserName}")
	  public User getUserByUserName(@PathVariable String searchUserName) throws Exception
	  {
		  return userService.getUserByUserName(searchUserName);
     }
	
	@GetMapping("userrole/{searchUserRole}")
	public List<User> getUserByUserRole(@PathVariable String searchUserRole) throws Exception
	{
		return userService.getUserByRole(searchUserRole);
	}
	
	
}