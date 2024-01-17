package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {
	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	
	System.out.println("값을 입력>>> ");
	String input = scn.nextLine();
	//input.equals("quit")
	while(true) {
		System.out.println("값을 입력>>> ");
		String input = scn.nextLine();
		if(input.equals("quit")) {
			break;
		}
	}
		
	// 입력값은 홍길동입니다.
	System.out.println("입력값은 %s"입니다, input );
	System.out.println();
	// "quit" 값이 들어오면 <<end of prog>>
	
	}
}
