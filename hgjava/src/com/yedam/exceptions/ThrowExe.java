package com.yedam.exceptions;

public class ThrowExe {
	public static void main(String[] args) {
		try {
			method();
		}catch(ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다. ");
		}catch(Exception ee) {
			System.out.println("알수없는 예외.");
		}
	}

	static void method() throws ClassNotFoundException, Exception { // 호출하는 아이에 예외떠넘기기 throws
		
		Class.forName("java.lang.String"); //일반예외이기때문에 반드시 예외처리해주어야한다. 
		Class.forName("java.lang.String"); 	// throws 처리하지않으면 try-catch블록을 하나하나 반복해야한다.
				
	}
}
