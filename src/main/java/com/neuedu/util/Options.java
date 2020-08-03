package com.neuedu.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neuedu.user.entity.UserDepartment;
import com.neuedu.user.service.UserService;

//本工具类用于生成动态下拉框列表选项
@Component
public class Options {

	@Autowired
	private UserService service;
	//获取科室的数据，生成动态下拉列表框
	public String getDeptOptions(Integer selectedId) {
		
		List<UserDepartment> list = service.queryUserDepartment();
		StringBuffer s = new StringBuffer();
		for(UserDepartment ud : list) {
			//生成 <option value='id' selected='selected'>name</option>
			s.append("<option value='");
			s.append(ud.getId());
			s.append("'");
			if(ud.getId().equals(selectedId)) {
				s.append(" selected='selected'");
			}
			s.append(">");
			s.append(ud.getDeptName());
			s.append("</option>");
		}
		return s.toString();
	}
	
}
