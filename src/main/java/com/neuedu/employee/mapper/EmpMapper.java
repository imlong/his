package com.neuedu.employee.mapper;

import java.util.List;

import com.neuedu.employee.entity.Emp;

public interface EmpMapper {

	List<Emp> queryAll(Emp emp);
	Emp queryById(Emp emp);
	int add(Emp emp);
	int update(Emp emp);
	int delete(Emp emp);
	
}
