package com.Jindong.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Jindong.dto.EmployeeDTO;
import com.Jindong.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Inject
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPro(EmployeeDTO employeeDTO, HttpSession session) {
		System.out.println("EmployeeController loginPro()");
		
		EmployeeDTO employeeDTO2=employeeService.userCheck(employeeDTO);
		System.out.println(employeeDTO2);
		if(employeeDTO2 != null) {
			
			session.setAttribute("Id", employeeDTO.getId());

			System.out.println(employeeDTO2.getId());
			
			return "redirect:/main";
		}else {
			return "main/loginErrorMsg";
		}
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {

		return "main/main";
	}
	
}
