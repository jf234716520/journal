package com.easy.journal.common.dao;

import org.springframework.stereotype.Service;
import com.easy.journal.common.model.User;

@Service
public interface UserMapper {
	
	public User getUserByUUID(String uuid);

	public void insert(User user);
}
