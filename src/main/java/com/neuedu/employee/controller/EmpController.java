package com.neuedu.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.employee.entity.Emp;
import com.neuedu.employee.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService service;
	//查询
	@RequestMapping(value = "/employee",params = "act=query")
	public String query(Model model,Emp emp) {
		List<Emp> list = service.queryAll(emp);
		model.addAttribute("list",list);
		return "/employee/query.jsp";
	}
	
	//增加
	@RequestMapping(value = "/employee",params = "act=add")
	public String add(Model model,Emp emp) {
		String str = "/employee/add.jsp";
		int i = service.add(emp);
		if (i > 0) {
			model.addAttribute("msg", "增加成功");
			str = "/employee/query.jsp";
		}else {
			model.addAttribute("msg", "增加失败");
		}
		return str;
	}
	
	//跳到修改页面
	@RequestMapping(value = "/employee",params = "act=toUpdate")
	public String toUpdate(Model model,Emp emp) {
		Emp emp2 = service.queryById(emp);
		model.addAttribute("emp", emp2);
		return "/employee/update.jsp";
	}
	//保存修改内容
	@RequestMapping(value = "/employee",params = "act=update")
	public String update(Model model,Emp emp) {
		String str = "/employee/update.jsp";
		int i = service.update(emp);
		if (i > 0) {
			model.addAttribute("msg", "修改成功");
			str = "/employee/query.jsp";
		}else {
			model.addAttribute("msg", "修改失败");
		}
		return str;
	}
	
	//删除
	@RequestMapping(value = "/employee",params = "act=delete")
	public String delete(Model model,Emp emp) {
		String str = "/employee/query.jsp";
		int i = service.delete(emp);
		if (i > 0) {
			model.addAttribute("msg", "修改成功");
			str = "/employee/query.jsp";
		}else {
			model.addAttribute("msg", "修改失败");
		}
		return str;
	}
	
}

