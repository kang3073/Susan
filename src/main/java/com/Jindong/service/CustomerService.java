package com.Jindong.service;

import java.util.List;

import com.Jindong.dto.CustomerDTO;

public interface CustomerService {
	
	public void insert(CustomerDTO customerDTO);
	
	public List<CustomerDTO> list();
	
	public List<CustomerDTO> update(String num);
	
}
