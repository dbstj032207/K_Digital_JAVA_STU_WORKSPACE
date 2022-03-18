package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;
	public OracleMyBatisService() {
		super();
		dao = new OracleMyBatisDAO();
	}
	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		
		return list;
	}
	public Dept selectByDeptno() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		
		Dept dept = new Dept();
		try {
			dept = dao.selectByDeptno(session);
		} finally {
			session.close();
		}
		return dept;
	}
	public List<Dept> selectAll2() {
SqlSession session = MySqlSessionFactory.getSqlSession();
		
		List<Dept> list = null;
		try {
			list = dao.selectAll2(session);
		} finally {
			session.close();
		}
		
		return list;
	}

	
}
