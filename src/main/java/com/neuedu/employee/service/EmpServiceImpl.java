package com.neuedu.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.employee.entity.Emp;
import com.neuedu.employee.mapper.EmpMapper;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper dao;
	
	@Override
	public List<Emp> queryAll(Emp emp) {
		
		return dao.queryAll(emp);
	}

	@Override
	public Emp queryById(Emp emp) {
		return dao.queryById(emp);
	}

	@Override
	public int add(Emp emp) {
		return dao.add(emp);
	}

	@Override
	public int update(Emp emp) {
		return dao.update(emp);
	}

	@Override
	public int delete(Emp emp) {
		return dao.delete(emp);
	}

}
