package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

// 컬렉션 ArrayList<Employee>
public class EmployeeArrayList implements EmployeeList{

	private static EmployeeArrayList instance = //
			new EmployeeArrayList();
	ArrayList<Employee> list;
	Scanner scn = new Scanner(System.in);
	
	
	private EmployeeArrayList() {}
	public static EmployeeArrayList getInstance() {
		return instance;
	}
	
	@Override
	public void init() {
		list = new ArrayList<Employee> ();
		System.out.println("초기화 완료.");
	}

	@Override
	public void input() {
		System.out.printf("%d 사번", list.size()); 
		int no =scn.nextInt();
		
		System.out.print("이름 >>");
		String name = scn.next();
		
		System.out.print("급여 >>");
		int sal = scn.nextInt();
		
		list.add(new Employee(no, name, sal));
	}

	@Override
	public String search(int empId) {	
		for(int i = 0 ; i < list.size(); i++) { //추가될때마다 담겨진 공간의크기만 반환.입력된 갯수만큼만 반복. null체크할필요없
			if(list.get(i).getDepartmentId() == empId) {
				list.get(i).getName();
			}
		}
		return "";
	}

	@Override
	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("사번 %4d, 이름 %7s, 급여 %7d\n",  
			list.get(i).getEmployeeId(),list.get(i).getName(),list.get(i).getSalary() );
		}		
	}

	@Override
	public int sum() {
		int total =0;
		for(int i = 0; i < list.size(); i++) {
			total  += list.get(i).getSalary();
		}	
		return total;	
	}

}
