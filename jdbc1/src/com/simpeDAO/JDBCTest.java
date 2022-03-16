package com.simpeDAO;

import java.util.ArrayList;

public class JDBCTest {

	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		int num = dao.insertDept(new DeptDTO(99, "서울", "부산"));
		System.out.println("main >>>> insert 레코드 개수: " + num);
		
		ArrayList<DeptDTO> list = dao.selectAllDept(); 	// 전체 레코드 출력
		for (DeptDTO deptDTO : list) {
			System.out.println("main >>>> " + deptDTO);
		}
		
	}

}
