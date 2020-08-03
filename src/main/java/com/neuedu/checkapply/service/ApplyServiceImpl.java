package com.neuedu.checkapply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.checkapply.entity.CheckApply;
import com.neuedu.checkapply.mapper.ApplyMapper;

@Service
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private ApplyMapper dao;
	
	@Override
	public List<CheckApply> queryAll(CheckApply checkApply) {
		return dao.queryAll(checkApply);
	}

	@Override
	public CheckApply queryById(CheckApply checkApply) {
		return dao.queryById(checkApply);
	}

	@Override
	public int add(CheckApply checkApply) {
		return dao.add(checkApply);
	}

	@Override
	public int update(CheckApply checkApply) {
		return dao.update(checkApply);
	}

	@Override
	public int delete(CheckApply checkApply) {
		return dao.delete(checkApply);
	}

	@Override
	public List<Object> queryAllPage(Object object) {
		return dao.queryAllPage(object);
	}

	@Override
	public int queryAllPageCounts(Object object) {
		return dao.queryAllPageCounts(object);
	}

	@Override
	public int zuoFei(CheckApply checkApply) {
		return dao.zuoFei(checkApply);
	}

}
