package com.Jindong.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.Jindong.dao.CustomerDAO;
import com.Jindong.dto.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Inject
	private CustomerDAO customerDAO;

	@Override
	public void insert(CustomerDTO customerDTO) {
		System.out.println("CustomerServiceImpl insert()");

		customerDAO.insert(customerDTO);		
	}

	@Override
	public List<CustomerDTO> list() {
		return customerDAO.list();
	}

	@Override
	public List<CustomerDTO> update(String num) {
		return customerDAO.update(num);
	}
	
	
}
