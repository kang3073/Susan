package com.Jindong.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.Jindong.dto.EmployeeDTO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.Jindong.mappers.employeeMapper";

	@Override
	public EmployeeDTO userCheck(EmployeeDTO employeeDTO) {
		System.out.println("EmployeeDAOImpl userCheck()");
		
		return sqlSession.selectOne(namespace+".userCheck", employeeDTO);
	}
}
