package com.yedam.thread.synchronize;

public class Calculator {
	// User1 , // User2 작업공간.
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		System.out.println(Thread.currentThread().getName());
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 다른 스레드가 들어와서 작업할 동안 2초 기다려줌 & 예외처리
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " >> " + this.memory); 
	}
}
