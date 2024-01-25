package com.yedam.thread;

import java.awt.Toolkit;

//Runnable 인터페이스의 구현객체를 통해서 쓰레드 생산.
public class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++ ) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 일시중지 기능
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	
}
