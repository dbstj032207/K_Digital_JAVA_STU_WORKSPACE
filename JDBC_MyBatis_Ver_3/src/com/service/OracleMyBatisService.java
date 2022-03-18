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
	
	public int insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int num = 0;
		try {
			num = dao.insert(session, dept);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}

	public void update(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		
		try {
			dao.update(session, dept);
			session.commit();
		} finally {
			session.close();
		}
		
	}
	public void delete(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		
		try {
			dao.delete(session, deptno);
			session.commit();
		} finally {
			session.close();
		}
		
	}

	
}
