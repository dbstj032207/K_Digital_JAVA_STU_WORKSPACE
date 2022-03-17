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

}
