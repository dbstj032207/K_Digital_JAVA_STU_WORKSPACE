package jdbc0;

import java.beans.Statement;
import java.sql.*;

public class JDBCTest3 {

	public static void main(String[] args) {
		
		// 1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";   	
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="scott";	
		String passwd ="tiger";	
		
		Connection con = null;	
		PreparedStatement pstmt = null;	
		
		try {
			// 2. 드라이버 생성 => new 이용
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ====================");
			
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db접속 성공 : " + con);
			
			// 4. SQL 작성
			
			String sql = "INSERT INTO DEPT (deptno, dname, loc) "
					+ "VALUES (?, ?, ?)";
			
			String sql2 = "INSERT INTO DEPT (deptno, dname, loc) "
					+ "VALUES (?, ?, ?)";
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 13);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "부산");
			
			
			
			// 6. 실행
			int num = pstmt.executeUpdate();
			pstmt.close();
			pstmt = con.prepareStatement(sql2);
			pstmt.setInt(1, 14);
			pstmt.setString(2, "개발2");
			pstmt.setString(3, "서울2");
			
			int num2 = pstmt.executeUpdate();
			System.out.println("실행된 레코드 개수: " + (num + num2));
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납 반대순서로 실행
				if(pstmt != null)	pstmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
