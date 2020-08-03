package com.neuedu.user.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.test.BaseTest;
import com.neuedu.user.entity.User;
import com.neuedu.util.Pager;

public class UserServiceImplTest extends BaseTest {

	@Autowired
	private UserService service;
	
	@Test
	public void testQueryAllPage() {
		//创建测试数据
		User u = new User();
		//u.setUserName("a");
		
		//设置分页信息
		Pager pager = new Pager();
		int rowCounts = service.queryAllPageCounts(u);//获取一共多少条记录
		int pageNum = 1;//获取第几页数据
		int rows = pager.getRows();//每页多少条记录
		int pageCounts = rowCounts/rows + (rowCounts%rows==0?0:1);
		int startRow = (pageNum-1)*rows;
		//数据封装
		pager.setRowCounts(rowCounts);
		pager.setPageCounts(pageCounts);
		pager.setStartRow(startRow);
		u.setPager(pager);
		
		List<User> list = service.queryAllPage(u);
		for (User u2 : list) {
			System.out.println("--u2="+u2);
		}
	}

}









