package com.yedam.reference;

public class ArrayExe1 {
	public static void main(String[] args) {
	//선언
	int[] intAry = {10,20,30}; // 정수값을 여러값을 모아놓은 배열 선언. intAry와 int는 같지않다.intAry[0] === int,각각의 타입은 정수이다.
	int[][] intArray= {{10,20},{30,40},{50}}; // 안에 있는 값도 배열. 위는 안에 들어가는 건 정수.
	//intArray[0] !== int,intArray[0][0] ===int// 0번째 위치에 가면 정수가 아니라 배열, 첫번째 요소 안의 요소가 정수.10 이 정수 
	
	String[] strAry = new String[5]; //크기선언
	strAry = new String[] {"Hello","World","Nice"};
	
	for(String elem : strAry) {
		System.out.println(elem);
	}
	}
}
