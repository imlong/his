package com.neuedu.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.user.entity.User;
import com.neuedu.user.entity.UserDepartment;
import com.neuedu.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private  UserMapper dao;
	
	@Override
	public List<User> queryAll(User u) {
		return dao.queryAll(u);
	}

	@Override
	public User queryById(User u) {
		return dao.queryById(u);
	}

	@Override
	public int add(User u) {
		return dao.add(u);
	}

	@Override
	public int update(User u) {
		return dao.update(u);
	}

	@Override
	public int delete(User u) {
		return dao.delete(u);
	}

	@Override
	public User login(User u) {
		return dao.login(u);
	}

	@Override
	public List<User> queryAllPage(User u) {
		return dao.queryAllPage(u);
	}

	@Override
	public int queryAllPageCounts(User u) {
		return dao.queryAllPageCounts(u);
	}

	@Override
	public List<UserDepartment> queryUserDepartment() {
		return dao.queryUserDepartment();
	}


}
