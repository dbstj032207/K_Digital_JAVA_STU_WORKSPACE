package com.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {
	
	// 1. 4가지 정보
	// static으로 변수 선언
	public static String driver="oracle.jdbc.driver.OracleDriver";// JdbcTemplate.driver
	public static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static String userid = "scott";
	public static String passwd = "tiger";
	
	public JdbcTemplate() {
		try {
			// 2. 드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공======");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패 =======");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 연결됨");
			conn.setAutoCommit(false);
		} catch (Exception e) {
			System.out.println("[JdbcTemplate.getConnection] : " + e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}
	
	

	/**
     * DB와 Connect되었는지 여부를 Return 한다.     * 
     * @return DB와 Connect 되었는지 여부.
     */
    public static boolean isConnected(Connection conn) {
        boolean validConnection = true;   //컨넥션이 살아 있는 경우 
        try {
            if (conn == null || conn.isClosed())
                validConnection = false;  //컨넥션이 죽은 경우 
        } catch (SQLException e) {
            validConnection = false;
            e.printStackTrace();
        }
        return validConnection;
    }

	
	public static void close(Connection conn) {
		if(isConnected(conn)) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void close(Statement stmt) {
		
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
     * ResultSet을 Close 한다.
     * 
     * @param result
     *            ResultSet 객체.
     */
    public static void close(ResultSet rset) {

        try {
            if (rset != null)
                rset.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * 지금까지의 트랜잭션을 Commit 처리한다.
     */
    public static void commit(Connection conn) {

        try {
            if (isConnected(conn)) {
                conn.commit();
                System.out.println("[JdbcTemplate.commit] : DB Successfully Committed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * 지금까지의 트랜잭션을 Rollback 처한다.
     */
    public static void rollback(Connection conn) {

        try {
            if (isConnected(conn)) {
                conn.rollback();
                System.out.println("[JdbcTemplate.rollback] : DB Successfully Rollbacked!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    


}
