package com.optusci.employe.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
//	@RequestMapping("/getEmploye")
//	public ModelAndView getEmploye(@RequestParam int empId) {
//		System.out.println(empId);
//		
//		ModelAndView mv = new ModelAndView("showEmploye.jsp");
//		EmpModel emp = repo.findById(empId).orElse(new EmpModel());
//		System.out.println(emp.getEmpId()+emp.getName()+emp.getDepartment());		
//		
//		System.out.println(repo.findByDepartment("HR"));
//		System.out.println(repo.findByDepartmentSorted("developer"));
//		
//		mv.addObject(emp);
//				
//		return mv;
//	}
	
	@RequestMapping("/employes")
	@ResponseBody
	public String Employe() {						
		return repo.findAll().toString();
	}
	
	@RequestMapping("/employes/{empId}")
	@ResponseBody
	public String getEmploye(@PathVariable("empId") int empId) {						
		return repo.findById(empId).toString();
	}


}
