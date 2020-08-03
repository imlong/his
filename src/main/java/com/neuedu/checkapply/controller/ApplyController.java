package com.neuedu.checkapply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.checkapply.entity.CheckApply;
import com.neuedu.checkapply.entity.CheckTemplate;
import com.neuedu.checkapply.service.ApplyService;
import com.neuedu.util.Pager;

@Controller
public class ApplyController {

	@Autowired
	private ApplyService service;
	
	//查询
	@RequestMapping(value = "/checkapply",params = "act=query")
	public String query(Model model,CheckApply checkApply) {
		//设置分页信息
		Pager pager = checkApply.getPager();
		
		int rowCounts = service.queryAllPageCounts(checkApply);//获取一共多少条记录
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
		checkApply.setPager(pager);
		
		List<Object> list = service.queryAllPage(checkApply);
		model.addAttribute("list",list);
		//把pager对象返回前台
		model.addAttribute("pager", pager);
		return "/checkapply/query.jsp";
	}
	
	//跳转到新增页面(通过queryById获得所选信息)
	@RequestMapping(value = "/checkapply",params = "act=toAdd")
	public String toAdd(Model model,CheckApply checkApply) {
		CheckApply checkApply2 = service.queryById(checkApply);
		model.addAttribute("checkApply",checkApply2);
		return "/checkapply/add.jsp";
	}
	
	//跳转到修改页面(通过queryById获得所选信息)
	@RequestMapping(value = "/checkapply",params = "act=toUpdate")
	public String toUpdate(Model model,CheckApply checkApply) {
		CheckApply checkApply2 = service.queryById(checkApply);
		model.addAttribute("checkApply",checkApply2);
		return "/checkapply/update.jsp";
	}
	
	//新增-暂存
	@RequestMapping(value = "/checkapply",params = "act=doZanCun")
	public String doZanCun(Model model,CheckApply checkApply) {
		String str = "/checkapply/add.jsp";
		checkApply.setState(1);//手动设状态为1：暂存
		int i = service.add(checkApply);
		if (i > 0) {
			model.addAttribute("msg", "暂存成功");
			str = "/checkapply/query.jsp";
		}else {
			model.addAttribute("msg", "暂存失败");
		}
		return str;
	}
	
	//新增-开立
	@RequestMapping(value = "/checkapply",params = "act=doKaiLi")
	public String doKaiLi(Model model,CheckApply checkApply) {
		checkApply.setState(2);
		String str = "/checkapply/add.jsp";
		int i = service.add(checkApply);
		if (i > 0) {
			model.addAttribute("msg", "开立成功");
			str = "/checkapply/query.jsp";
		}else {
			model.addAttribute("msg", "开立失败");
		}
		return str;
	}
	
	//修改-暂存
	@RequestMapping(value = "/checkapply",params = "act=doZanCun2")
	public String doZanCun2(Model model,CheckApply checkApply) {
		String str = "/checkapply/update.jsp";
		checkApply.setState(1);//手动设状态为1：暂存
		int i = service.update(checkApply);
		if (i > 0) {
			model.addAttribute("msg", "暂存成功");
			str = "/checkapply/query.jsp";
		}else {
			model.addAttribute("msg", "暂存失败");
		}
		return str;
	}
	
	//修改-开立
	@RequestMapping(value = "/checkapply",params = "act=doKaiLi2")
	public String doKaiLi2(Model model,CheckApply checkApply) {
		
		String str = "/checkapply/update.jsp";
		checkApply.setState(2);
		int i = service.update(checkApply);
		if (i > 0) {
			model.addAttribute("msg", "开立成功");
			str = "/checkapply/query.jsp";
		}else {
			model.addAttribute("msg", "开立失败");
		}
		return str;
	}
	
	//删除
	@RequestMapping(value="/checkapply", params="act=delete")
	public String delete(Model model, CheckApply checkApply) {
		String str = "/checkapply/query.jsp";
		int i = service.delete(checkApply);
		if(i>0) {
			model.addAttribute("msg", "删除成功");
		}else {
			model.addAttribute("msg", "删除失败");
		}
		return str;
	}
	
	//作废
	@RequestMapping(value="/checkapply", params="act=zuoFei")
	public String zuoFei(Model model, CheckApply checkApply) {
		String str = "/checkapply/query.jsp";
		//checkApply.setState(0);//后台已修改
		int i = service.zuoFei(checkApply);
		if(i>0) {
			model.addAttribute("msg", "作废成功");
		}else {
			model.addAttribute("msg", "作废失败");
		}
		return str;
	}
	
	//引用模板-->查询模板信息
	@RequestMapping(value = "/checkapply",params = "act=queryTemplate")
	public String queryTemplate(Model model,CheckTemplate checkTemplate) {
		//设置分页信息
		Pager pager = checkTemplate.getPager();
		
		int rowCounts = service.queryAllPageCounts(checkTemplate);//获取一共多少条记录
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
		
		checkTemplate.setPager(pager);
		
		List<Object> list = service.queryAllPage(checkTemplate);
		model.addAttribute("list",list);
		//把pager对象返回前台
		model.addAttribute("pager", pager);
		return "/checkapply/query.jsp";
	}
	
	
	
	
	
}
