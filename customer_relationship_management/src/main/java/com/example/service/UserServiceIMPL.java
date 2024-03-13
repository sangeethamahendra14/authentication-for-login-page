package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.User;
import com.example.Repo.UserRepo;

import com.example.dto.UserDto;
import com.example.dto.UserRegSaveDto;
//import com.example.dto.userDto;
//import com.example.dto.userRegSaveDto;

@Service
public class UserServiceIMPL implements UserServices  {

	@Autowired
	private UserRepo Userrepo;
	
	@Override
	public String addUser(UserRegSaveDto UserRegSaveDto) {
		
		User user= new User(
				UserRegSaveDto.getName(),
				UserRegSaveDto.getEmail(),
				UserRegSaveDto.getOrganization(),
				UserRegSaveDto.getPassword()
				
				);
		Userrepo.save(user);
		return user.getName();
		
		
	}

	@Override
	public List<UserDto> getuser() {
		List<User> getusers= Userrepo.findAll();
		List<UserDto>userDtoList= new ArrayList<>();
		
		for(User u:getusers) {
			UserDto UserDto= new UserDto(
					u.getId(),
					u.getName(),
					u.getEmail(),
					u.getOrganization(),
					u.getPassword()
					
					
					);
			userDtoList.add(UserDto);
		}
		
		return userDtoList;
	}

}
