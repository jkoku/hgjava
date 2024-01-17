package com.yedam.operator;

import java.util.Scanner;

public class OperarExe1 {
	public static void main(String[] args) {
		
		//method1(); method1실행됨
		
		int result = 0;
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력>>>");
			String input = scn.nextLine();
			if (input.equals("quit")) {
				break;
			}
		//사용자 값을 입력: 정수 입력.  
		result += Integer.parseInt(input);
				
		//try { Integer.parseInt(input);
		//}catch(Exception e) {
		// System.out.println("잘못된 값을 입력.")
		//}
		
		//누적값은 15입니다.
		}
		System.out.printf("누적 값은 %d입니다 \n" , result);
		System.out.println("end of prog.");
}

	
	
	
public static void method1() {
		int sum = (1 + 2) * 3;
		sum = sum + 5;
		sum += 5;
		
		String str = "";
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("문자열 입력하세요>>>");
			String input =scn.nextLine();
			if (input.equals("quit")) {
				break;
			}
			str += input + " " ; //계속 누적 	
		}
		System.out.printf("누적내용: %s ",str);
	}
}