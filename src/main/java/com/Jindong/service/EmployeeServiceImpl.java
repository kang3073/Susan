package com.Jindong.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.Jindong.dao.EmployeeDAO;
import com.Jindong.dto.EmployeeDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Inject
	private EmployeeDAO employeeDAO;
	
	@Override
	public EmployeeDTO userCheck(EmployeeDTO employeeDTO) {
		System.out.println("EmployeeServiceImpl userCheck()");
		
		return employeeDAO.userCheck(employeeDTO);
	}
}
