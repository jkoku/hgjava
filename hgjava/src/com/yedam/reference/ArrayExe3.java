package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe3 {
	public static void main(String[] args) {
	Friend f1 = new Friend(); //초기화 친구의 정보를 담기위한 공간만들기.초기화작업. 인스턴스를 만든다.
	f1.name="홍길동";//공간에 값 담기
	f1.weight=67.8;
	f1.score = 80;

	Friend f2 = new Friend();
	f2.name="김길동";//공간에 값 담기
	f2.weight= 77.3;
	f2.score = 67;

	Friend f3 = new Friend();
	f3.name="김민석";//공간에 값 담기
	f3.weight= 71.9;
	f3.score = 91;
	
	//새로운 친구.
	String name = "김말숙";
	double weight = 55.5;
	int score = 88;
	
	Friend f4 = new Friend();
	f4.name = name;
	f4.weight = weight;
	f4.score = score;
	
	Friend[] friends = {f1, f2, f3}; 
	friends = new Friend[5]; //객체는 초기값{null,null,null,null,null}/ 정수는 0이 들어가있다면 참조타입은 null이 담겨져있다.
	friends[0] = f1;
	friends[1] = f2;
	friends[2] = f3;
	friends[3] = f4;//{f1,f2,f3,f4,null} //실행시점 오류 런타임에러. 

	//김말숙 => 88점 => 90점으로 변경
	Scanner scn = new Scanner(System.in);
	System.out.println("찾을친구>>>");
	String fname = scn.nextLine();
	System.out.println("변경점수입력>>>");
	int fscore = Integer.parseInt(scn.nextLine());
	
	// 목록출력 // .name.equals 이라는 속성을 가져와야 쓸 수 있다.
	for(int i = 0; i < friends.length; i++) {  
		if(friends[i] != null && friends[i].name.equals(fname)) {  
			friends[i].score = fscore;
			System.out.printf(" %s의 몸무게 %.1fkg 점수 %d ",friends[i].name, friends[i].weight,friends[i].score);
		}
	}
		

	}//main
} //class
