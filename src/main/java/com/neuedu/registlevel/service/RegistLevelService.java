package com.neuedu.registlevel.service;

import java.util.List;

import com.neuedu.registlevel.entity.RegistLevel;

public interface RegistLevelService {

	List<RegistLevel> queryAll(RegistLevel registLevel);
	RegistLevel queryById(RegistLevel registLevel);
	int add(RegistLevel registLevel);
	int update(RegistLevel registLevel);
	int delete(RegistLevel registLevel);
}
