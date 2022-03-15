package jdbc0;

import java.beans.Statement;
import java.sql.*;

public class StatementTest {

	public static void main(String[] args) {
		
		// 1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";   	// jdbc 드라이버 이름
						// 드라이버 이름이 다를 경우 java.lang.ClassNotFoundException 발생
		String url="jdbc:oracle:thin:@localhost:1521:xe";	// 접속 db 정보 127.0.0.1 = localhost
															// 포트번호 = 1521, SID = xe
						// url 이름이 다를 경우 java.sql.SQLException 발생
		String userid ="scott";	// 사용자 계정
		String passwd ="tiger";	// 패스워드
		
		
		Connection con = null;	// url을 이용해서 db에 접속해주는 객체
		java.sql.Statement stmt = null;	// 접속 후 sql을 실행해주는 객체, Statement(구 방식), PreparedStatement(신 방식)
		ResultSet rs = null;	// 실행된 sql의 결과를 저장하는 객체
		
		try {
			// 2. 드라이버 생성 => new 이용
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ====================");
			
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db접속 성공 : " + con);
			
			// 4. SQL 작성
//			String sql = "SELECT DEPTNO x, DNAME, LOC FROM DEPT";
			
			String name = "RESEARCH";
			String sql = "SELECT DEPTNO x, DNAME, LOC "
					+ "FROM DEPT "
					+ "WHERE DNAME = " + "'" + name + "'";
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			stmt = con.createStatement();
			
			// 6. Statement 이용 sql 실행 후 결과를 ResultSet으로 받기
			rs = stmt.executeQuery(sql);	// select문은 executeQuery함수 이용,
			// insert, update, delete는 executeUpdate(sql)함수 이용
			
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
				if(stmt != null)	stmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
