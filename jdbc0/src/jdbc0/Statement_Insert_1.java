package jdbc0;

import java.beans.Statement;
import java.sql.*;

public class Statement_Insert_1 {

	public static void main(String[] args) {
		
		// 1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="scott";	
		String passwd ="tiger";	
		
		Connection con = null;	
		java.sql.Statement stmt = null;	
		ResultSet rs = null;	// select 결과만 저장 : executeQuery("select")의 리턴타입
		// insert, update, delete: dml의 결과는 영향받은 레코드 개수 int로 리턴
		// executeUpdate(dml sql)는 레코드 개수를 리턴
		
		try {
			// 2. 드라이버 생성 => new 이용
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ====================");
			
			// 3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db접속 성공 : " + con);
			
			// 4. SQL 작성
			int deptno = 89;
			String deptname = "개발";
			String loc = "서울";
			String sql = "INSERT INTO DEPT (deptno, dname, loc) " +
					"values (" + deptno + ", '" + deptname + "', '" + loc + "')";

			
			System.out.println(sql);
			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			stmt = con.createStatement();
			
			
			// 6. Statement 이용 sql 실행 후 결과를 ResultSet으로 받기
			
			// insert, update, delete는 executeUpdate(sql)함수 이용
			int result = stmt.executeUpdate(sql);
			System.out.println("삽입된 레코드 개수 : " + result);
			
			String sql2 = "SELECT DEPTNO x, DNAME, LOC "
					+ "FROM DEPT ";
			rs = stmt.executeQuery(sql2);	// select문은 executeQuery함수 이용,
			// ResultSet  출력
			while(rs.next()) {
//				int deptno = rs.getInt("x");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				int deptno1 = rs.getInt(1);	// 데이터 타입이 다를경우 Type mismatch 에러 발생
				String dname = rs.getString(2);
				String loc1 = rs.getString(3);
				System.out.println(deptno1 + "\t" + dname + "\t" + loc1);
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
