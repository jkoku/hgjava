package com.yedam.api;

public class ObjectExe {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.equals(obj2)); //Object.equals() 에 따라 처리되는 기능이 다르다. 객체비교하면 false.
		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2)); //
		
		// 직접 정의한 클래스.
		Member mbr1 = new Member();
		Member mbr2 = new Member();
		mbr1.name ="김회원";
		mbr1.age =20;
		mbr2.name ="김회원";
		mbr2.age =21;
		
		System.out.println(mbr1.equals(mbr2)); // 주소값을 비교하면 false 인데 equals로이름같으면 true 라고 재정의
		
	}
}
