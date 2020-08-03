package com.neuedu.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.user.entity.User;
import com.neuedu.user.entity.UserDepartment;
import com.neuedu.user.service.UserService;
import com.neuedu.util.Options;
import com.neuedu.util.Pager;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private Options options;
	
	//查询
	@RequestMapping(value = "/user",params = "act=query")
	public String query(Model model,User user) {
		//设置分页信息
		Pager pager = user.getPager();
		int rowCounts = service.queryAllPageCounts(user);//获取一共多少条记录
		int pageNum = pager.getPageNum();//获取第几页数据
		
		
		int rows = pager.getRows();//每页多少条记录
		int pageCounts = rowCounts/rows + (rowCounts%rows==0?0:1);//一共多少页
		//设置页数条件
		if (pageNum < 1) {//最小为1
			pageNum = 1;
		}
		if (pageNum > pageCounts && pageCounts >= 1) {
			pageNum = pageCounts;//最大为总页数
		}
		pager.setPageNum(pageNum);//将最新的pageNum存回去
		int startRow = (pageNum-1)*rows;
		//数据封装
		pager.setRowCounts(rowCounts);
		pager.setPageCounts(pageCounts);
		pager.setStartRow(startRow);
		user.setPager(pager);
		
		List<User> list = service.queryAllPage(user);
		model.addAttribute("list",list);
		
		//把pager对象返回前台
		model.addAttribute("pager", pager);
		
		//向前台返回部门下拉列表框的值
		String s = options.getDeptOptions(user.getDeptId());
		model.addAttribute("deptOptions", s);
		
		return "/user/query.jsp";
	}
	
	//查询(无分页功能的查询)
	@RequestMapping(value = "/user",params = "act=query-bak")
	public String query_bak(Model model,User user) {
		List<User> list = service.queryAll(user);
		model.addAttribute("list",list);
		return "/user/query.jsp";
	}
	
	//跳转到修改页面
	@RequestMapping(value = "/user",params = "act=toUpdate")
	public String toUpdate(Model model,User user) {
		User user2 = service.queryById(user);
		model.addAttribute("user",user2);
		return "/user/update.jsp";
	}
	
	//保存修改内容
	@RequestMapping(value = "/user",params = "act=update")
	public String update(Model model,User user) {
		String str = "/user/update.jsp";
		user.setDelMark(1);//手动设置删除标记为1
		int i = service.update(user);
		if (i > 0) {
			model.addAttribute("msg", "修改成功");
			str = "/user/query.jsp";
		}else {
			model.addAttribute("msg", "修改失败");
		}
		return str;
	}
	
	//增加
	@RequestMapping(value = "/user",params = "act=add")
	public String add(Model model,User user) {
		String str = "/user/add.jsp";
		user.setDelMark(1);//手动设置删除标记为1
		int i = service.add(user);
		if (i > 0) {
			model.addAttribute("msg", "添加成功");
			str = "/user/query.jsp";
		}else {
			model.addAttribute("msg", "添加失败");
		}
		return str;
	}
	
	//删除
	@RequestMapping(value="/user", params="act=delete")
	public String delete(Model model, User user) {
		String str = "/user/query.jsp";
		int i = service.delete(user);
		if(i>0) {
			model.addAttribute("msg", "删除成功");
		}else {
			model.addAttribute("msg", "删除失败");
		}
		return str;
	}
	
	//跳转到查询页面，可以获取动态下拉列表框的值
	@RequestMapping(value="/user", params="act=toQuery")
	public String toQuery(Model model) {
		//向前台返回部门下拉列表框的值
		String s = options.getDeptOptions(null);
		model.addAttribute("deptOptions", s);
		
		return "/user/query.jsp";
	}
	
	
}
