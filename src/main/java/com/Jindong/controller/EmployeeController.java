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

//	@RequestMapping(value = "/main/login", method = RequestMethod.GET)
//	public String login() {
//		return "main/login";
//	}
	
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public String loginPro(EmployeeDTO employeeDTO, HttpSession session) {
		System.out.println("EmployeeController loginPro()");
		
		EmployeeDTO employeeDTO2=employeeService.userCheck(employeeDTO);
		System.out.println(employeeDTO2);
		if(employeeDTO2 != null) {
			
			session.setAttribute("Id", employeeDTO.getId());

			System.out.println(employeeDTO2.getId());
			
			return "main/main";
		}else {
			return "main/loginErrorMsg";
		}
	}
	
	@RequestMapping(value = "/main/main", method = RequestMethod.GET)
	public String main() {
//		주소줄 변경없이 이동
//		/WEB-INF/views/파일이름.jsp
//		/WEB-INF/views/main/main.jsp
		return "main/main";
	}
	
}
