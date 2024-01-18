package com.yedam.todo;

import java.util.Scanner;

public class Todo0117 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//친구 3명의 이름가 연락처를 입력하도록.. 메세지출력.
		//입력완료.
		String[] strAry = new String[6];
		int idx = 0;
		for (int i =1 ; i <=3; i ++) {
			System.out.println("이름>>");
			strAry[idx++] = scn.nextLine();
			System.out.println("연락처>>");
			strAry[idx++] = scn.nextLine();
		}	
		for(int i = 0; i < strAry.length; i++) { //밖에서는 6번 반복..
			if (i % 2 == 0) {
				System.out.println("이름:" + strAry[i]);
			}else {
				System.out.println("연락처:" + strAry[i]);
				System.out.println("===================");
			}
		}  		
//		이름: 홍길동
//		연락처: 010-1111-2222
//		===================
//		이름: 김길동
//		연락처: 010-2222-3333
//		===================
//		이름: 박길동
//		연락처: 010-3333-4444
//		===================
}
}

	
//	Scanner scn = new Scanner(System.in);
//	
//	String names = "";
//	System.out.println("친구이름");
//	names = scn.nextLine();