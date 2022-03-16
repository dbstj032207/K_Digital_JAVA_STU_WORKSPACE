package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleService {
	
	OracleDAO dao;

	public OracleService() {
		dao = new OracleDAO();
	}

	public ArrayList<Dept> select() throws SQLException{
		// TODO Auto-generated method stub
		ArrayList<Dept> list = dao.select();
		return list;
	}

	public int insert(Dept xx) {
		int num = dao.insert(xx);
		return num;
	}

	public int update(Dept xx2) throws RecordNotFoundException{
		int num = dao.update(xx2);
		return num;
	}

	public int delete(int i) {
		int num = dao.delete(i);
		return num;
	}

	public ArrayList<Dept> selectDeptno(int i) throws SQLException{
		// TODO Auto-generated method stub
		ArrayList<Dept> list = dao.selectDeptno(i);
		return list;
	}
	
	

}
