package com.Jindong.dao;

import java.util.List;

import com.Jindong.dto.CustomerDTO;

public interface CustomerDAO {
	public void insert(CustomerDTO customerDTO);
	
	public List<CustomerDTO> list();
	
	public List<CustomerDTO> update(String num);
}
