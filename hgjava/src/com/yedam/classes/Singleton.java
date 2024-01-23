package com.yedam.classes;

//전체 프로그램에서 인스턴스를 하나만 생성. (인스턴스를 계속 만들지 않겠다)
public class Singleton {
	// 1. 생성자를 private 선언.
	// 2. Singleton 타입의 필드 선언.
	// 3. 인스턴스를 반환하도록 getInstance() 제공.
	private static Singleton instance = new Singleton(); //초기값은 null이라 값넣어줌
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
