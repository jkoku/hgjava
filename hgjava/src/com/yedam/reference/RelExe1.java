package com.yedam.reference;

public class RelExe1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 100;
		System.out.println(n1 == n2); // 값을비교
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println(str1 == str2);  // 참조값일경우 주소값을 비교. str1,2는 서로다른 객체의 주소값을 참조하고 있기때문에 false.
		System.out.println(str1.equals(str2)); // 값을 비교하려면 equals로 비교해야한다. true
		
		int[] intAry = new int[10]; //주소값을 가지고 있다. intAry는 참조변수
		intAry = null; // 더 이상 참조하는 값이 없다. 
		System.out.println(intAry[0]); //주소값 보여줌 NullPointException 발생.
	
	}//main
}//class
