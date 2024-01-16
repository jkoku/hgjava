package com.yedam.variable;

import java.util.Iterator;

public class VariableExe5 {
	public static void main(String[] args) {
	
		double d1 =10.0; //10.0d : 더블타입의10.0
		double result = d1 + (double) 20.0f; // 큰 형태로 변환.
		
		int sum = 60;
		result = sum*1.0 / 7 ; // sum도 7도 정수 소수아닌 정수부분만 남음 모양만 8.0
		System.out.println(result);
		
		
		//String str = "1" + 3 ;
		sum = Integer.parseInt("1") + 3 + 5 ; //하나가 문자면 앞의 문자열을 따라 뒤도 문자열도 바꿈  
		
		result = Double.parseDouble("1.234") + 2.3  ;
		
		
		
		// char 65536(2byte)개에
		for(int i = 0; i < 10; i++) {
		int temp = (int) (Math.random() * 25) +97;
		System.out.println((char) temp);
		}
	}
}
