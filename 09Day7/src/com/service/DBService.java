package com.service;

import com.dao.*;

public class DBService {
	
//	public void setDAO(MySQLDAO dao) {
//		dao.connectMySQL();
//	}
	
	public void setDAO(OracleDAO dao) {
		dao.connectOracle();
	}
	
}
