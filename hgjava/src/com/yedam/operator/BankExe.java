package com.yedam.operator;

import java.util.Scanner;

//은행계좌. 잔고는 55000 입금이나 출금액은 100000원을 넘으면 안된다.
public class BankExe {
	public static void main(String[] args) {
		// 입금,출금, 잔고확인, 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.입금 2.출금 3.잔고 4.종료.");

			int menu = Integer.parseInt(scn.nextLine());
			int val = 0;
			switch (menu) {
			case 1:
				System.out.println("입금액>> ");
				val = Integer.parseInt(scn.nextLine());
				if (balance + val > 100000) {
					System.out.println("입금액을 초과하였습니다");
					break;
				}
				balance += val;
				System.out.println("저장성공!");
				break;
			case 2:
				System.out.println("출금액>>");
				val -= Integer.parseInt(scn.nextLine());
				if (balance < val) {
					System.out.println("출금액을 초과하였습니다");
				}
				balance -= val;
				System.out.println("저장성공!");
				break;
			case 3:
				System.out.printf("잔액: %d \n", balance);
				break;
			case 4:
				run = false;
			}
		}

		System.out.println("end of prog.");
	}

}