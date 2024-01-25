package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.Date;

//empNo, empName, hireDtae, salary.
public class Employee {
	private int empNo;
	private String empName;
	private Date hireDate;
	private int salary;

	// 생성자.
	public Employee(int empNo, String empName, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	Date getHireDate() {
		return hireDate;
	}
	
	
	// to string overriding
	@Override
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", hireDate=" + sdf.format(hireDate) + ", salary=" + salary
				+ "]";
	}
	
	
}
