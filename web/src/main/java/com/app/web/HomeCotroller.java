package com.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeCotroller {
	
	@RequestMapping("home")
//	@ResponseBody
	public String home(HttpServletRequest req) {		
		String name = req.getParameter("name");		
		HttpSession session= req.getSession();
		session.setAttribute("session_key", name);
		System.out.println("Hi "+ name);
		return "home";
	}

}
