package jdbc0;

import java.beans.Statement;
import java.sql.*;

public class Statement_delete_Test {

	public static void main(String[] args) {
		
		// 1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="scott";	
		String passwd ="tiger";	
		
		Connection con = null;	
		java.sql.Statement stmt = null;	
		try {
			// 2. 드라이버 생성 => new 이용
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ====================");
			
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db접속 성공 : " + con);
			
			// 4. SQL 작성
			int deptno = 90;
			String sql = "DELETE FROM DEPT WHERE DEPTNO = " + deptno;

			System.out.println(sql);

			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			stmt = con.createStatement();
			
			
			// 6. Statement 이용 sql 실행 후 결과를 ResultSet으로 받기
			
			// insert, update, delete는 executeUpdate(sql)함수 이용
			int num = stmt.executeUpdate(sql);

			System.out.println("실행된 레코드 개수: " + num);

		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납 반대순서로 실행
				if(stmt != null)	stmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
