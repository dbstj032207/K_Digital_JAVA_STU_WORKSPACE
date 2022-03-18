package com.dao;

import java.util.HashMap;
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

	public List<Dept> selectAll2(SqlSession session) {
		// select 함수 두가지: selectList(mapper.id), selectOne()
				List<Dept> list = session.selectList("selectAll2");
				return list;
	}

	public List<Dept> multiSelectMap(SqlSession session, HashMap<String, Integer> map) {
		List<Dept> list = session.selectList("multiSelectMap", map);
		return list;
	}

}
