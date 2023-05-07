package com.Jindong.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Jindong.dto.CustomerDTO;
import com.Jindong.service.CustomerService;

@Controller
public class CustomerController {
	
	@Inject
	private CustomerService customerService;
	
	@RequestMapping(value = "/guest", method = RequestMethod.GET)
	public String guest(HttpServletRequest request, Model model) {
		System.out.println("CustomerController customerList()");
		
		List<CustomerDTO> customerList=customerService.list();
		
		model.addAttribute("customerList", customerList);
		
		return "guest/guestList";
	}
	
	@RequestMapping(value = "/guest/insert", method = RequestMethod.GET)
	public String insert() {
		System.out.println("CustomerController insert()");
	
		return "guest/insertForm";
	}
	
	@RequestMapping(value = "/guest/insertPro", method = RequestMethod.POST)
	public String insertCustomer(CustomerDTO customerDTO) {
		System.out.println("CustomerController insertPro()");

		customerService.insert(customerDTO);
		return "guest/close";
	}
	
	@RequestMapping(value = "/guest/update", method = RequestMethod.GET)
	public String updateCustomer(HttpServletRequest request, Model model) {
		System.out.println("CustomerController customerUpdate()");
		String num=request.getParameter("num");
		
		List<CustomerDTO> customerUpdate=customerService.update(num);
		
		model.addAttribute("customerUpdate", customerUpdate);
		return "guest/updateForm";
	}
}
