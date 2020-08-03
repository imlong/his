package com.neuedu.registlevel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.registlevel.entity.RegistLevel;
import com.neuedu.registlevel.mapper.RegistLevelMapper;


@Service
public class RegistLevelServiceImpl implements RegistLevelService {

	@Autowired
	private RegistLevelMapper dao;
	
	@Override
	public List<RegistLevel> queryAll(RegistLevel registLevel) {
		return dao.queryAll(registLevel);
	}

	@Override
	public RegistLevel queryById(RegistLevel registLevel) {
		return dao.queryById(registLevel);
	}

	@Override
	public int add(RegistLevel registLevel) {
		return dao.add(registLevel);
	}

	@Override
	public int update(RegistLevel registLevel) {
		return dao.update(registLevel);
	}

	@Override
	public int delete(RegistLevel registLevel) {
		return dao.delete(registLevel);
	}

}
