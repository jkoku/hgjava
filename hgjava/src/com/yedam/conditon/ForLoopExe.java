package com.yedam.conditon;

public class ForLoopExe {
	public static void main(String[] args) {
		// i +=2 : 2씩증가 
		for(int i = 1; i < 10; i +=2 ) {
			System.out.println(i);
			if(i > 5) {
				break;
			}
		}
		
		//1부터 10까지의 합을 계산.
		int sum = 0;
		for(int n = 1; n <= 10; n++) {
			if(n % 3 == 0)
			sum += n;
		}
		System.out.printf("누적값은 %d\n", sum);
		
		//1~31 까지 반복. 1월달력
		System.out.println("SunMonTueWedThrFriSat");
		System.out.printf("%3s","");
		for (int d = 1; d <= 31; d++) {
			System.out.printf("%3d", d);
			if(d % 7 == 6) {
				System.out.println();
			} 
		}

//		System.out.println(i); 반복문 밖에서는 선언해도 에러
	}
}
