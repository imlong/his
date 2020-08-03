package com.neuedu.registlevel.controller;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.registlevel.entity.RegistLevel;
import com.neuedu.registlevel.service.RegistLevelService;

@Controller
public class RegistLevelController {

	@Autowired
	private RegistLevelService service;
	
	//查询
	@RequestMapping(value = "/registlevel",params = "act=query")
	public String query(Model model,RegistLevel registLevel) {
		List<RegistLevel> list = service.queryAll(registLevel);
		model.addAttribute("list", list);
		return "/registlevel/query.jsp";
	}
	
	//增加
	@RequestMapping(value = "/registlevel",params = "act=add")
	public String add(Model model,RegistLevel registLevel) {
		String str = "/registlevel/add.jsp";
		registLevel.setDelMark(1);
		int i = service.add(registLevel);
		if (i > 0) {
			model.addAttribute("msg", "增加成功");
			str = "/registlevel/query.jsp";
		}else {
			model.addAttribute("msg", "增加失败");
		}
		return str;
	}
	
	//跳到修改页面
	@RequestMapping(value = "/registlevel",params = "act=toUpdate")
	public String toUpdate(Model model,RegistLevel registLevel) {
		RegistLevel registLevel2 = service.queryById(registLevel);
		model.addAttribute("registLevel", registLevel2);
		return "/registlevel/update.jsp";
	}
	//保存修改内容
	@RequestMapping(value = "/registlevel",params = "act=update")
	public String update(Model model,RegistLevel registLevel) {
		String str = "/registlevel/update.jsp";
		registLevel.setDelMark(1);
		int i = service.update(registLevel);
		if (i > 0) {
			model.addAttribute("msg", "修改成功");
			str = "/registlevel/query.jsp";
		}else {
			model.addAttribute("msg", "修改失败");
		}
		return str;
	}
	
	//删除-修改标记为0
	@RequestMapping(value = "/registlevel",params = "act=delete")
	public String delete(Model model,RegistLevel registLevel) {
		int i = service.delete(registLevel);
		if (i > 0) {
			model.addAttribute("msg", "删除成功");
		}else {
			model.addAttribute("msg", "删除失败");
		}
		return "/registlevel/query.jsp";
	}
	
}
