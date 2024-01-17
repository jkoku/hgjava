package com.yedam.conditon;

import java.util.Scanner;

public class WhileLoopExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 어떤 조건일 동안 반복.
		int random = (int)(Math.random()* 100) +1 ; // 1~10 정수.
		while(true) {
			System.out.println("값입력>> ");
			 int i = scn.nextInt();
			 if(random == i) {
				 System.out.printf("임의값 %d\n", random);
				 break;
			 }else if(random > i) {
				 System.out.printf("%d보다 더 큽니다.\n", i);
			 }else if(random < i) {
				 System.out.printf("%d보다 더 작습니다.\n", i);
			 }
		}
		 
		System.out.println("end of prog.");
}
}

//while(true) {
//System.out.println("값입력>> ");
//int val = scn.nextInt();
//if	(random == val) {
//	System.out.printf("임의값 %d\n", random);
//	break;
//}
////값이 틀린경우를 구분
//if(random > val) {
//	System.out.println("입력값보다 큽니다.");
//	continue; 
//}
//System.out.println("입력값보다 작습니다.")
//
//
