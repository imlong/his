package com.neuedu.registlevel.mapper;

import java.util.List;

import com.neuedu.registlevel.entity.RegistLevel;

public interface RegistLevelMapper {

	List<RegistLevel> queryAll(RegistLevel registLevel);
	RegistLevel queryById(RegistLevel registLevel);
	int add(RegistLevel registLevel);
	int update(RegistLevel registLevel);
	int delete(RegistLevel registLevel);
}
