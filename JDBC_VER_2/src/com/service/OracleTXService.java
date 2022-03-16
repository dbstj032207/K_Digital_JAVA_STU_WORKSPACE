package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTXDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTXService {
	// 1. 4가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	OracleTXDAO dao;

	public OracleTXService() {
		super();
		dao = new OracleTXDAO();
		try {
			// 2. 드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	public ArrayList<Dept> select() throws SQLException{
		Connection con = null;
		ArrayList<Dept> list = null;
		try {
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("in sercive. select() conn = " + con);
			list = dao.select(con);
		} finally {
			if(con !=  null) con.close();
		}
		return list;
	}

	public int insert(Dept xx) {
		Connection con = null;
		int num = 0;
		try {
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			num = dao.insert(con, xx);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(con !=  null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return num;
	}

	public int update(Dept xx2) throws RecordNotFoundException{
		Connection con = null;
		int num = 0;
		try {
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			num = dao.update(con, xx2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(con !=  null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return num;
	}

	public int delete(int i) {
		Connection con = null;
		int num = 0;
		try {
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			num = dao.delete(con, i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(con !=  null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return num;
	}

	public ArrayList<Dept> selectDeptno(int i) throws SQLException{
		// TODO Auto-generated method stub
		Connection con = null;
		ArrayList<Dept> list = null;
		try {
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.selectDeptno(con, i);
		} finally {
			if(con !=  null) con.close();
		}
		return list;
	}
	
	

}
