package com.yedam.exceptions;

public class RuntiemExe {
  
	public static void main(String[] args) {
	// 일반예외. 예외를 안걸어주면 컴파일 자체가 안되서 프로그램실행이 안됨.
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	// 실행예외.컴파일상에는 오류아님. 실행을해봐야알수있음.  
	String str = null; //객체 참조변수 참조값 
	try {
	System.out.println(str.toString());
	} catch(NullPointerException e) {
		System.out.println("참조값이 없음");
	}
	str = "10";
	
	try {
	int num = Integer.parseInt(str);
	System.out.println(num);
	}catch (NumberFormatException e) {
		System.out.println("숫자로 변경 불가.");
	}
	System.out.println("end of porg.");
	
	}
}
