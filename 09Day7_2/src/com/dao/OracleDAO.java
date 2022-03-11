package com.dao;

public class OracleDAO implements DBDAO{
	
	@Override
	public void connect() {
		System.out.println("OracleDAO.connect");
	}

}
