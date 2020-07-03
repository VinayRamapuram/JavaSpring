package com.optusci.employe.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.optusci.employe.dao.EmployeRepo;
import com.optusci.employe.model.EmpModel;

@Controller
public class EmployeControler {
	
	@Autowired
	EmployeRepo repo;	 
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addEmploye")
	public String addEmploye(EmpModel emp) {
		repo.save(emp);		
		return "home.jsp";
	}

}
