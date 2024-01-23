package com.yedam.classes;

public class SingletonExe {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();// new Singleton(); s1은힙영역에 만들어진 객체의 주소값을 반환
		Singleton s2 = Singleton.getInstance();
		 
		System.out.println(s1 == s2);
	}
}
