package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();

	}
	public int deptRecordCount() {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		int num=0;
		try {
			num= dao.deptRecordCount(session);
		}finally {
			session.close();
		}
		return num;
	}
	
	
	
	
	
	public  void delete(int deptno) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
		dao.delete(session, deptno);
		session.commit();//명시적
		}finally {
			session.close();
		}
	}
	public void update(Dept dept) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
			dao.update(session, dept);
			session.commit();//명시적 
		}finally {
			session.close();
		}
	}
	public Dept selectByDeptno(int deptno) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		Dept dept=null;
		try {
		 dept=	dao.selectByDeptno(session, deptno);
		}finally {
			session.close();
		}
		return dept;
	}
	
	
	
	
	public void insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.insert(session, dept);
			session.commit();//명시적으로 꼭 해주어야 함. 
		} finally {
			session.close();
		}
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
	
	public HashMap selectByDeptnoHashmap(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		HashMap map = new HashMap();
		try {
			map = dao.selectByDeptnoHashmap(session, deptno);
		} finally {
			session.close();
		}
		return map;
	}
	
	public List<Dept> selectByHashmap(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectByHashmap(session, map);
		} finally {
			session.close();
		}
		return list;
	}
	public List<Dept> selectDynamicDeptno(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno(session, map);
		} finally {
			session.close();
		}
		return list;
	}
	

}
