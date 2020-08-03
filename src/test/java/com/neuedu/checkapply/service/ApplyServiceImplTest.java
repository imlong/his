package com.neuedu.checkapply.service;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.checkapply.entity.CheckApply;
import com.neuedu.test.BaseTest;
import com.neuedu.user.entity.User;
import com.neuedu.util.Pager;

public class ApplyServiceImplTest extends BaseTest {

	@Autowired
	private ApplyService service;
	
	@Test
	public void testQueryAll() {
		
		//创建测试数据
		CheckApply checkApply = new CheckApply();
		//u.setUserName("a");
		
		//设置分页信息
		Pager pager = new Pager();
		int rowCounts = service.queryAllPageCounts(checkApply);//获取一共多少条记录
		int pageNum = 1;//获取第几页数据
		int rows = pager.getRows();//每页多少条记录
		int pageCounts = rowCounts/rows + (rowCounts%rows==0?0:1);
		int startRow = (pageNum-1)*rows;
		//数据封装
		pager.setRowCounts(rowCounts);
		pager.setPageCounts(pageCounts);
		pager.setStartRow(startRow);
		checkApply.setPager(pager);
		
		List<Object> list = service.queryAllPage(checkApply);
		for (Object object : list) {
			CheckApply checkApply2 = (CheckApply)object;
			System.out.println("--apply="+checkApply2);
		}
	}

}
