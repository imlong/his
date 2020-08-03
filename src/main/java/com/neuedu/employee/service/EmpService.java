package com.neuedu.employee.service;

import java.util.List;

import com.neuedu.employee.entity.Emp;

public interface EmpService {

	List<Emp> queryAll(Emp emp);
	Emp queryById(Emp emp);
	int add(Emp emp);
	int update(Emp emp);
	int delete(Emp emp);
	
	
}
