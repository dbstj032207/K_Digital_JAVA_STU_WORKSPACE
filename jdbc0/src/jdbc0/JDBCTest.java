package jdbc0;

import java.beans.Statement;
import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		
		// 1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";   	
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="scott";	
		String passwd ="tiger";	
		
		
		Connection con = null;	
		PreparedStatement pstmt = null;	
		ResultSet rs = null;	
		
		try {
			// 2. 드라이버 생성 => new 이용
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ====================");
			
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db접속 성공 : " + con);
			
			// 4. SQL 작성

//			String sql = "SELECT DEPTNO x, DNAME, LOC "
//					+ "FROM DEPT "
//					+ "WHERE dname = ? "
//					+ "AND loc = ?";
			
			String sql = "SELECT DEPTNO x, DNAME, LOC "
					+ "FROM DEPT "
					+ "WHERE deptno = ?";
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
			
			// 6. 실행해서 결과받기
			pstmt.setInt(1, 40);

			rs = pstmt.executeQuery();
			
			// ResultSet  출력
			while(rs.next()) {
//				int deptno = rs.getInt("x");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				int deptno = rs.getInt(1);	// 데이터 타입이 다를경우 Type mismatch 에러 발생
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
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
		}

	}

}
