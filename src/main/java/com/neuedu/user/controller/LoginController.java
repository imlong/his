package com.neuedu.user.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.fabric.Response;
import com.neuedu.user.entity.User;
import com.neuedu.user.entity.UserDepartment;
import com.neuedu.user.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/login")
	public String login(Model model,HttpServletResponse response,HttpSession session,User user,String rembMe) {
		String str = "/login.jsp";
		
		//创建cookie，将用户信息放在cookie中
		Cookie nameCookie = new Cookie("userName",user.getUserName());
		Cookie pwdCookie = new Cookie("password",user.getPassword());
		if (rembMe != null) {//选择记住密码
			//设置cookie保存的时间，单位是秒
			nameCookie.setMaxAge(24*60*60);//
			pwdCookie.setMaxAge(24*60*60);
			//设置访问路径
			nameCookie.setPath("/");//全部路径
			pwdCookie.setPath("/");
			//将cookie存入response域中，响应给客户端
			response.addCookie(nameCookie);
			response.addCookie(pwdCookie);
		}else {//不用保存
			//将cookie中指定内容清除
			nameCookie.setMaxAge(0);
			pwdCookie.setMaxAge(0);
			//设置路径
			nameCookie.setPath("/");
			pwdCookie.setPath("/");
			//将cookie存入response中，响应给客户端
			response.addCookie(nameCookie);
			response.addCookie(pwdCookie);
		}
		User user2 = service.login(user);
		if (user2!=null) {
			str =  "/index.jsp";
			//管理员登录
			//if ("admin".equals(user2.getUserName()) && "admin123".equals(user2.getPassword())) {
				session.setAttribute("USER", user2);
				user.setUserName(null);//springMVC自动回显，可以设置为空避免显示
			//}else {
				//其他用户登录
			//}
		}else {
			model.addAttribute("msg","用户名或密码错误,请重新输入");
		}
		return str;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "/login.jsp";
		
	}
}
