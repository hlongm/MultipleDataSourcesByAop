package com.dewell.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dewell.entity.User;
import com.dewell.mapper.UserMapper;
import com.dewell.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	
	public List<User> selectAll() {
		List<User> users = userMapper.selectAll();
		if(users!=null&&!users.isEmpty()){
			return users;
		}
		return null;
	}

}
