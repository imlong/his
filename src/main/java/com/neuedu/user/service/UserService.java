package com.neuedu.user.service;

import java.util.List;

import com.neuedu.user.entity.User;
import com.neuedu.user.entity.UserDepartment;

public interface UserService {

	List<User> queryAll(User u);
	User queryById(User u);
	int add(User u);
	int update(User u);
	int delete(User u);

	User login(User u);
	
	List<User> queryAllPage(User u);
	int queryAllPageCounts(User u);
	
	List<UserDepartment> queryUserDepartment();
}
