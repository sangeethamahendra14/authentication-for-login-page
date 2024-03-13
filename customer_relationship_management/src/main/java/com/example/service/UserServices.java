package com.example.service;

import java.util.List;

import com.example.dto.UserDto;
import com.example.dto.UserRegSaveDto;


public interface UserServices {

	String addUser(UserRegSaveDto userRegSaveDto);

	List<UserDto> getuser() ;

}
