package com.yedam.thread;

import java.awt.Toolkit;

public class BeepThread extends Thread{
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
