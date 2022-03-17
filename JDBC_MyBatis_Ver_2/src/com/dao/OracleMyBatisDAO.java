package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {
	
	public OracleMyBatisDAO() {}

	public List<Dept> selectAll(SqlSession session) {
		
		// select 함수 두가지: selectList(mapper.id), selectOne()
		List<Dept> list = session.selectList("selectAll");
		return list;
	}

	public Dept selectByDeptno(SqlSession session) {
		
		Dept dept = session.selectOne("selectByDeptno");
		
		return dept;
	}

	public int insert(SqlSession session, Dept dept) {
		
		int num = session.insert("deptInsert", dept); // sql문 id, dept객체 넘김
		System.out.println("추가된 레코드 ==== " + num);
		return num;
	}

}
