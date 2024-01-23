package com.yedam.impl;

public class FlyerExe {
	public static void main(String[] args) {
		Flyer flyer = new Airplane(); 	 // 구현클래스
		flyer.takeOff();
		
		flyer = new Helocopter(); 	
		flyer.takeOff();
		
		flyer  = new Seaplane();
		
		Driver driver = new Driver();
		driver.driver(flyer); // 매개변수의 다형성
	}
}
