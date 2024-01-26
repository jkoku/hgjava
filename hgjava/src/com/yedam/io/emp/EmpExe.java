package com.yedam.io.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.yedam.io.Student;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		EmpApp app = new EmpApp();

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.println("선택>>>");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // "사원번호 이름 입사일자 급여" yy-MM-dd
			
				Employee emp = new Employee(0, "", new Date(), 0);
				System.out.println("사원번호 이름 입사일자 급여");
				String info = scn.nextLine();				
				String[] empAry = info.split(" ");
				 
				SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
				Employee employee =null;
				try {
					employee = new Employee(Integer.parseInt(empAry[0]), // 사원번호
							empAry[1], // 사원이름
							sdf.parse(empAry[2]), // 입사일자
							Integer.parseInt(empAry[3])// 급여
					);				 
				} catch (ParseException e) {
					System.out.println("날짜포맷오류");
					break;
				}
				
				if (app.add(employee)) {
					System.out.println("등록완료");
				} else {
					System.out.println("등록에러.");
				}
				break;
			case 2:
				List<Employee> list = app.list();
				for (Employee std : list) {
					System.out.println(std.toString());
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				app.save();
				run = false;
			}
		}

		System.out.println("end of prog.");
	}
}
