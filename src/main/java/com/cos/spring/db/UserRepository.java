package com.cos.spring.db;

import com.cos.spring.model.User;

public interface UserRepository {
	User findByUsername(String username);
}
