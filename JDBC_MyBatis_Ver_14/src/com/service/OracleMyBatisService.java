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
	public void multiDelete( List<Dept> depts) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
			dao.multiDelete(session, depts); 
			session.commit();//명시적
		}finally {
			session.close();
		}
	}
	
	public void multiInsert(List<Dept> depts) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
			dao.multiInsert(session, depts); 
			session.commit();//명시적
		}finally {
			session.close();
		}
		
	}
	
	public void multiUpdate(List<Integer> deptnoes2) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		try {
		dao.multiUpdate(session, deptnoes2);
		session.commit();
		}finally {
			session.close();
		}
	}
	public List<Dept> multiSelect(List<Integer> deptnoes){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list= null;
		try {
			list= dao.multiSelect(session, deptnoes);
		}finally {
			session.close();
		}
		return list;
	}
	public List<Dept> selectDynamicChoose(HashMap<String, String> map){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list= null;
		try {
		list= session.selectList("com.dept.DeptMapper3.selectDynamicChoose", map);
		}finally {
		   session.close();
		}
		return list;
	}
	public List<Dept>  selectDynamicDeptno(HashMap<String, Integer> map){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list= null;
		try {
				list= dao.selectDynamicDeptno(session, map);
		}finally {
			session.close();
		}
		return list;
	}
	public List<Dept> selectByHashMap(HashMap<String, Integer> map){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		List<Dept> list= null;
		try {
		 list=dao.selectByHashMap(session, map);
		}finally {
			session.close();
		}
		return list;
	}
	public HashMap selectByDeptnoHashMap(int deptno) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		HashMap map=null;
		try {
			map=	dao.selectByDeptnoHashMap(session, deptno);
		}finally {
			session.close();
		}
		return map;
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
	
	public List<Dept> selectTopN(int i, int j) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectTopN(session, i, j);
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Dept> selectTopN(String string, int i, int j) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectTopN(session, string, i, j);
		} finally {
			session.close();
		}
		return list;
	}

	

}
