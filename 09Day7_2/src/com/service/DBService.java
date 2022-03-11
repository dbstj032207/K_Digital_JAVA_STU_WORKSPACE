package com.service;

import com.dao.*;

public class DBService {
	
	public void setDAO(DBDAO dao) {	// Oracle MySQL 둘다 받을 수 있음
		dao.connect();	// 실제 넘어오는 객체의 connect()함수 실행
	}
	
}
