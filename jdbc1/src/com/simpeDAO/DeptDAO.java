package com.simpeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAO {	// db 접속 
	
	// 1. 4가지 정보
	String driver="oracle.jdbc.driver.OracleDriver";   	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String userid ="scott";	
	String passwd ="tiger";
	
	public DeptDAO() {	// DeptDAO 생성시 드라이버 로딩
		super();
		
		try {
			// 2. 드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}



	public ArrayList<DeptDTO> selectAllDept() {
		Connection con = null;	
		PreparedStatement pstmt = null;	
		ResultSet rs = null;
		ArrayList<DeptDTO> list = new ArrayList<>();
		try {
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db접속 성공 : " + con);
			
			// 4. SQL 작성
			String sql = "SELECT DEPTNO x, DNAME, LOC "
					+ "FROM DEPT ";
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
						
			// 6. 실행해서 결과받기
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + "\t" + dname + "\t" + loc);
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납 반대순서로 실행
				if(rs != null)	rs.close();
				if(pstmt != null)	pstmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//end finally
		return list;
	}



	public int insertDept(DeptDTO deptDTO) {
		Connection con = null;	
		PreparedStatement pstmt = null;	
		int num = 0;
		
		try {
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db접속 성공 : " + con);
			
			// 4. SQL 작성
			String sql = "INSERT INTO DEPT (deptno, dname, loc) "
					+ "VALUES (?, ?, ?)";
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptDTO.getDeptno());
			pstmt.setString(2, deptDTO.getDname());
			pstmt.setString(3, deptDTO.getLoc());
						
			// 6. 실행해서 결과받기
			num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 개수: " + num);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납 반대순서로 실행
				if(pstmt != null)	pstmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//end finally
		
		return num;
	}	
			
}
