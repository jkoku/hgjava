package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		String str = "Hello";
		str = new String("Hello");
		byte[] bytes = str.getBytes(); //문자열 바이트로 반환 배열로. 72 - H
		for (byte b : bytes) { 
			System.out.println(b); 
		}
		str = new String(new byte[] {72,101,108,108,111});

		int pos = str.indexOf("a"); //position 의미  a를 넣으면 -1(없음의 값)
		System.out.println("1은" + pos + "위치에있음");
		
		char chr = str.charAt(0);
		System.out.println(chr);
		
		}
	}