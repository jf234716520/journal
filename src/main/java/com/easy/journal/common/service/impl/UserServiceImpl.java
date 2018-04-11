package com.easy.journal.common.service.impl;

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

}
