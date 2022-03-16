package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTXDAO {

	public OracleTXDAO() {	// OracleDAO 생성시 드라이버 로딩
		super();
	}	
	
	public ArrayList<Dept> select(Connection con) throws SQLException{
		ArrayList<Dept> list = new ArrayList<Dept>();
		
		PreparedStatement pstmt = null;	
		ResultSet rs = null;
			
		// 4. SQL 작성
		String sql = "SELECT DEPTNO x, DNAME, LOC "
					+ "FROM DEPT ";
			
		// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
		pstmt = con.prepareStatement(sql);
						
		// 6. 실행해서 결과받기
		rs = pstmt.executeQuery();
			
		while(rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString(2);
			String loc = rs.getString("loc");
//			System.out.println(deptno + "\t" + dname + "\t" + loc);
			Dept dto = new Dept(deptno, dname, loc);
			list.add(dto);
		}
			
		// 7. 자원반납 반대순서로 실행
		if(rs != null)	rs.close();
		if(pstmt != null)	pstmt.close();
		return list;
	}

	public int insert(Connection con, Dept xx) {
			
		PreparedStatement pstmt = null;	
		int num = 0;
		
		try {
			System.out.println("db접속 성공 : " + con);
			
			// 4. SQL 작성
			String sql = "INSERT INTO DEPT (deptno, dname, loc) "
					+ "VALUES (?, ?, ?)";
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, xx.getDeptno());
			pstmt.setString(2, xx.getDname());
			pstmt.setString(3, xx.getLoc());
						
			// 6. 실행해서 결과받기
			num = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납 반대순서로 실행
				if(pstmt != null)	pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//end finally
		
		return num;
	}

	public int update(Connection con, Dept xx2) throws RecordNotFoundException{	
		PreparedStatement pstmt = null;	
		int num = 0;
		
		try {
			
			// 4. SQL 작성
			String sql = "UPDATE DEPT SET DNAME = ?, loc = ?"
					+ "where deptno = ? ";
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, xx2.getDname());
			pstmt.setString(2, xx2.getLoc());
			pstmt.setInt(3, xx2.getDeptno());
			
			// 6. 실행해서 결과받기
			num = pstmt.executeUpdate();
			System.out.println("실행결과" + num);
			if(num == 0) {
				throw new RecordNotFoundException(xx2.getDeptno() + "레코드가 없음");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납 반대순서로 실행
				if(pstmt != null)	pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//end finally
		
		return num;
	}

	public int delete(Connection con, int i) {
		PreparedStatement pstmt = null;	
		int num = 0;
		
		try {
			
			// 4. SQL 작성
//			String sql = "DELETE FROM DEPT WHERE DEPTNO = ?";
			String sql = "DE FROM DEPT WHERE DEPTNO = ?";	// 고의로 에러 발생
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			
			// 6. 실행해서 결과받기
			num = pstmt.executeUpdate();
			System.out.println("실행결과" + num);
			if(num == 0) {
				throw new RecordNotFoundException(i + "레코드가 없음");
			}
			
		} catch (SQLException e) {
			try {
				System.out.println("in dao.delete Rollback =======================");
				con.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납 반대순서로 실행
				if(pstmt != null)	pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//end finally
		
		return num;
	}

	public ArrayList<Dept> selectDeptno(Connection con, int i) throws SQLException {
		ArrayList<Dept> list = new ArrayList<Dept>();
		
		PreparedStatement pstmt = null;	
		ResultSet rs = null;
		
			
		// 4. SQL 작성
		String sql = "SELECT DEPTNO x, DNAME, LOC "
					+ "FROM DEPT "
					+ "WHERE deptno = ?";
			
		// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
		pstmt = con.prepareStatement(sql);
						
		// 6. 실행해서 결과받기
		pstmt.setInt(1, i);
		rs = pstmt.executeQuery();
		
			
		while(rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString(2);
			String loc = rs.getString("loc");
			Dept dto = new Dept(deptno, dname, loc);
			list.add(dto);
		}
			
		// 7. 자원반납 반대순서로 실행
		if(rs != null)	rs.close();
		return list;
		
	}

}
