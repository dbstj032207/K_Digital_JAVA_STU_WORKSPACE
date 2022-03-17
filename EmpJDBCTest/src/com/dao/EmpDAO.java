package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpDAO {

	public ArrayList<EmpDTO> selectAllEmp(Connection con) {
		ArrayList<EmpDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;	
		ResultSet rs = null;	
		
		try {

			String sql = "select empno,ename,job,mgr, to_char(hiredate,'YYYY-MM-DD') hiredate,sal,comm,deptno from emp "
							+ "order by empno desc";

			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
			
			// 6. 실행해서 결과받기
			rs = pstmt.executeQuery();
			
			// ResultSet  출력
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal =rs.getDouble("sal");
				double comm =rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				EmpDTO dto  = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

	public void insert(Connection con, EmpDTO empDTO) throws DataNotFoundException {
		PreparedStatement pstmt = null;	
		
		try {
			String sql = "INSERT INTO EMP "
					+ "VALUES (?, ?, ?, ?, sysdate, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, empDTO.getEmpno());
			pstmt.setString(2, empDTO.getEname());
			pstmt.setString(3, empDTO.getJob());
			pstmt.setInt(4, empDTO.getMgr());
			pstmt.setDouble(5, empDTO.getSal());
			pstmt.setDouble(6, empDTO.getComm());
			pstmt.setInt(7, empDTO.getDeptno());
			
			int n = pstmt.executeUpdate();
			System.out.println("insert된 개수 : " + n);
			
		}  catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			JdbcTemplate.close(pstmt);
		}
		
	}

	public EmpDTO selectDetailEmp(Connection con, String string) {
		PreparedStatement pstmt = null;	
		ResultSet rs = null;	
		EmpDTO dto  = new EmpDTO();
		int s_empno = Integer.parseInt(string);
		try {

			String sql = "select empno,ename,job,mgr, to_char(hiredate,'YYYY-MM-DD') hiredate,sal,comm,deptno from emp "
							+ "where empno = ?"
							+ "order by empno desc";

			
			// 5. SQL 실행 준비 ==> :con에서 실행할 Statement 객체 얻기
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, s_empno);
			
			// 6. 실행해서 결과받기
			rs = pstmt.executeQuery();
			
			// ResultSet  출력
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal =rs.getDouble("sal");
				double comm =rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				dto.setComm(comm);
				dto.setDeptno(deptno);
				dto.setEmpno(empno);
				dto.setEname(ename);
				dto.setHiredate(hiredate);
				dto.setJob(job);
				dto.setMgr(mgr);
				dto.setSal(sal);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return dto;
	}

	public void update(Connection con, EmpDTO empDTO) {
		PreparedStatement pstmt = null;	
		
		try {
			String sql = "UPDATE EMP SET job = ?, sal = ? "
					+ "where empno = ? ";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, empDTO.getJob());
			pstmt.setDouble(2, empDTO.getSal());
			pstmt.setInt(3, empDTO.getEmpno());
			
			int n = pstmt.executeUpdate();
			
			if(n == 0) {
				throw new DataNotFoundException(empDTO.getEmpno() + "번 사원이 없습니다. ");
			}
			
			System.out.println("update된 개수 : " + n);
			
		}  catch (SQLException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e1) {
			e1.printStackTrace();
		}
		finally {
			JdbcTemplate.close(pstmt);
		}
		
	}

	public void delete(Connection con, String string) {
		PreparedStatement pstmt = null;	
		int s_empno = Integer.parseInt(string);
		try {
			String sql = "DELETE FROM EMP  "
					+ "where empno = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, s_empno);
			
			int n = pstmt.executeUpdate();
			
			if(n == 0) {
				throw new DataNotFoundException(s_empno + "번 사원이 없습니다. ");
			}
			
			System.out.println("delete된 개수 : " + n);
			
		}  catch (SQLException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e1) {
			e1.printStackTrace();
		}
		finally {
			JdbcTemplate.close(pstmt);
		}
		
	}

	public ArrayList<EmpDTO> selectAllEmp2(Connection con, HashMap<String, String> map) {
		
		ArrayList<EmpDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;	
		ResultSet rs = null;	

		try {
			// 4. SQL문 작성
			String sql = "select empno,ename,job,mgr, to_char(hiredate,'YYYY-MM-DD') hiredate,sal,comm,deptno "
					+ "from emp "
					+ "where job=? and deptno=? ";

			
			// 5. SQL 실행 준비
			pstmt = con.prepareStatement(sql);
			
			Set <String> keys = map.keySet();
			for (String key : keys) {	
				System.out.println(key + "\t" + map.get(key));	
				if(key.equals("job")) {
					pstmt.setString(1, map.get(key));
				} else if(key.equals("deptno")){
					pstmt.setInt(2, Integer.parseInt(map.get(key)));
				} else {
					System.out.println("일치하는 키 값이 없습니다.");
				}
				
			}
			// 6. 실행해서 결과받기
			rs = pstmt.executeQuery();
			
			// ResultSet  출력
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal =rs.getDouble("sal");
				double comm =rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				EmpDTO dto  = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

	
}
