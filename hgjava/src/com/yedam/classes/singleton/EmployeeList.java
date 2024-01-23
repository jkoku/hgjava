package com.yedam.classes.singleton;

import java.util.Scanner;

public class EmployeeList {
	//싱글턴.
	private static EmployeeList instance = new EmployeeList();
	//필드선언
	Employee[] list; //사원배열.
	int empNum; // 현재의 사원 수. 
	Scanner scn = new Scanner(System.in);
	
	private EmployeeList() {}
	public static EmployeeList getInstance() {
		return instance;
	}	
	
	// 사원수 입력 초기화.
	public void init() {
		System.out.println("사원수 >>");
		int num = scn.nextInt();
		list = new Employee[num];
		empNum = 0;
	//	num;
	}
	
	//사원정보 입력=> 배열추가.
	public void input() {
		if(empNum == list.length) {
			System.out.println("입력초과");
			return; // return은 메소드 중단 의미. input기능 종료의미
		}
		System.out.printf("%d 사번", empNum);
		int no =scn.nextInt();
		
		System.out.print("이름 >>");
		String name = scn.next();
		
		System.out.print("급여 >>");
		int sal = scn.nextInt();
		
		list[empNum++] = new Employee(no, name, sal);
	} 

	//사번에 해당하는 이름 출력.
	public String search(int empId) {
		//해당사번이 있으면 사원이름 반환.이름없으면 " "반환.
		for (int i = 0; i < empNum; i++) {
			if (list[i] != null && list[i].getEmployeeId() == empId) {
				list[i].setEmployeeId(empId);
				return list[i].getName();
			}
		}
		return "";
	}
	
//	for(int  i =0; i < empNum;i++) {
//		if(list[i].getemployeeId() == employeeId) {
//			return list[i].getName();
//		}
//	} 
// return "";
//}
	
	
	//전체출력.
	public void print() {    // void 리턴값 ㄴㄴ
		// 사원번호, 이름, 급여 출력. 	
		for (int i = 0; i < empNum; i++) {
				System.out.printf("사원수 %4d, 이름 %10s, 급여 %7d\n",  
				list[i].getEmployeeId(),list[i].getName(),list[i].getSalary() );
		}
	}

	// 급여합계.
	public void sum() {
		int total =0;
		for(int i = 0; i < empNum; i++) {
			total  += list[i].getSalary();
		}	
		return total;
	}	

}
