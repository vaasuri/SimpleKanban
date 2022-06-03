package com.aasurihome.simplekanban.service.impl;

import org.springframework.stereotype.Service;

import com.aasurihome.simplekanban.model.User;
import com.aasurihome.simplekanban.service.UserService;

@Service
public class InMemoryUserService implements UserService {

	// TODO: For now, single user implementation for an in-memory implementation.
	private static User user = new User();
	
	@Override
	public User getUser() {
		return user;
	}

}
