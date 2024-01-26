package com.yedam.io.emp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Serializable{ // 직렬화역직렬화 표식
	private int empNo;
	private String empName;
	private Date hireDate;
	private int salary;

	public Employee(int empNo, String empName, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		return "[사원번호: " + empNo + ", 사원이름: " + empName + ", 입사날짜: " + sdf.format(hireDate) + ", 급여: " + salary
				+ "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
}
