package com.easy.journal.common.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.easy.journal.common.dao.UserMapper;
import com.easy.journal.common.model.User;
import com.easy.journal.common.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUserByUUID(String uuid) {
		
		return userMapper.getUserByUUID(uuid);
	}

	@Override
	public void register(String name, String password) {
		
		User user  = new User();
		user.setName(name);
		user.setPassword(password);
		user.setUuid(UUID.randomUUID().toString());
		userMapper.insert(user);
	}

}
