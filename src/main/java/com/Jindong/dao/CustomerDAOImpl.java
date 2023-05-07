package com.Jindong.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.Jindong.dto.CustomerDTO;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.Jindong.mappers.customerMapper";
	
	@Override
	public void insert(CustomerDTO customerDTO) {
		System.out.println("CustomerDAOImpl insert()");
		//메서드 호출
		sqlSession.insert(namespace+".insert", customerDTO);
		
	}

	@Override
	public List<CustomerDTO> list() {
		return sqlSession.selectList(namespace+".list");
	}

	@Override
	public List<CustomerDTO> update(String num) {
		return sqlSession.selectList(namespace+".update");
	}
	
	

}
