package com.yedam.thread;

class PrintThread2 extends Thread{
	@Override
	public void run() {
		while(true) { // 무한반복
			System.out.println("실행중... ");  
			
			try {							
				Thread.sleep(1); 			//예외를 받아들이는 코드. sleep은 예외받아야하니까.
			} catch (InterruptedException e) {	
				break;	// 쓰레드를 종료하기 위한 코드작성. 				
			}
		}	
		System.out.println("자원정리...");
		System.out.println("실행종료...");
	}
}

public class InterruptExe {
	public static void main(String[] args) {
		
		PrintThread2 thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		
		}
		
		thread.interrupt(); // 실행되는 thread에 Interrupted에외
	}
}
