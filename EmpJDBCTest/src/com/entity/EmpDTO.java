package com.entity;

public class EmpDTO {
	// 모델 클래스 작성 시 멤버변수명과 테이블 컬럼명이 일치
	private int empno;
	private String ename;
	private String job;
	private int mgr;//관리자번호
	private String hiredate;//문자열
	private double sal;
	private double comm;
	private int deptno;
	
	public EmpDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpDTO(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	

}
