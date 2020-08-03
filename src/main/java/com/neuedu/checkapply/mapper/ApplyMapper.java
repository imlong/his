package com.neuedu.checkapply.mapper;

import java.util.List;

import com.neuedu.checkapply.entity.CheckApply;
import com.neuedu.user.entity.User;

public interface ApplyMapper {

	//查询
	List<CheckApply> queryAll(CheckApply checkApply);
	//根据ID查询
	CheckApply queryById(CheckApply checkApply);
	//增加
	int add(CheckApply checkApply);
	//修改
	int update(CheckApply checkApply);
	//删除
	int delete(CheckApply checkApply);
	//作废
	int zuoFei(CheckApply checkApply);
	//分页查询
	List<Object> queryAllPage(Object object);
	
	int queryAllPageCounts(Object object);
	
//	//分页查询
//	List<CheckApply> queryAllPage(CheckApply checkApply);
//	int queryAllPageCounts(CheckApply checkApply);
	
}
