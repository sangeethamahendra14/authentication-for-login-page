package com.example.User_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDto;
import com.example.dto.UserRegSaveDto;
import com.example.service.UserServices;

@ResponseStatus
@RestController
@RequestMapping("/crm")
public class User_controller {
	
	@Autowired
	
	
	private UserServices userservice;
	
	@PostMapping(path="save")
	public String saveUser(@RequestBody UserRegSaveDto UserRegSaveDto) {
		
		String id =userservice.addUser(UserRegSaveDto);
		return id;
		
	}
	@GetMapping("viewuser")
	public List<UserDto> getuser()
	{
		List<UserDto>getuser=userservice.getuser();
		return getuser;
		}

}
