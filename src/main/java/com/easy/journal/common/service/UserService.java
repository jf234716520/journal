package com.easy.journal.common.service;

import com.easy.journal.common.model.User;

public interface UserService {
	
	/**
	 * 根据uuid查询用户
	 * @param uuid
	 * @return
	 */
	public User getUserByUUID(String i);
	/**
	 * 注册新用户
	 * @param name
	 * @param password
	 */
	public void register(String name, String password);
}
