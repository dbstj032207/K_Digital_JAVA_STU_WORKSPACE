package com.biz;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {
	
	EmpDAO dao;

	public EmpBiz() {
		dao = new EmpDAO();
		JdbcTemplate template = new JdbcTemplate(); // 드라이버 로딩
	}

	public ArrayList<EmpDTO> selectAllEmp() {
		Connection con = JdbcTemplate.getConnection(); 	// autocommit(false)
		ArrayList<EmpDTO> list = dao.selectAllEmp(con);
		JdbcTemplate.close(con);
		return list;
	}

	public void empInsert(EmpDTO empDTO) throws DataNotFoundException{
		Connection con = JdbcTemplate.getConnection();
		dao.insert(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}

	public EmpDTO selectDetailEmp(String string) {
		Connection con = JdbcTemplate.getConnection(); 	// autocommit(false)
		EmpDTO empdto = dao.selectDetailEmp(con, string);
		JdbcTemplate.close(con);
		return empdto;
	}

	public void empUpdate(EmpDTO empDTO) {
		Connection con = JdbcTemplate.getConnection();
		dao.update(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
		
	}

	public void empDelete(String string) {
		Connection con = JdbcTemplate.getConnection();
		dao.delete(con, string);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
		
	}

	public ArrayList<EmpDTO> selectAllEmp2(HashMap<String, String> map) {
		Connection con = JdbcTemplate.getConnection(); 	// autocommit(false)
		ArrayList<EmpDTO> list = dao.selectAllEmp2(con, map);
		JdbcTemplate.close(con);
		return list;
	}
	
	
	
	
}
