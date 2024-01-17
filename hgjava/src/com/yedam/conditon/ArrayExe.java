package com.yedam.conditon;

public class ArrayExe {
	public static void main(String[] args) {
	//정수를 담을 수 있는 배열 intAry는 하나의 변수  [10] 10개를 담을수 있는 공간선언
	int[] intAry = {10,20,30}; // int intAry
	intAry[2] = 40;
	
	intAry = new int[] {10,20,30,40,50};
	intAry = new int[10];
	
	System.out.println(intAry[0] + ", 크기:" + intAry.length);
	intAry[0] = 100;
	// 첫번째 방은 0 크기보다 하나 작은값에 대입. 반복문 같이 사용
	
		for(int i = 0; i< 10; i++) {
		intAry[i] = (int) (Math.random()* 10);
		}
		// 2,3의 배수의 값을 각각 int sum2, sum3에 저장.
		int sum2,sum3;
		sum2 = sum3 = 0; //값 초기화
		for (int i = 0;i <10 ;i++ ) {
		System.out.println(intAry[i]);
			if(intAry[i] % 2 == 0 ) {
				sum2 += intAry[i] ;
			}
			if(intAry[i] % 3 == 0) {
				sum3 += intAry[i] ;
			}				
		}		
		System.out.printf("2의 배수의 합: %d, 3의 배수의 합: %d" , sum2 , sum3);
	// 각각 출력... 6
	
	String[] strAry = {"Hong","Park","Kim","20"}; 
		for (int i=0; i<strAry.length;i++) {
		System.out.println(strAry[i]);
		}
	
	}
	}



	// 2,3의 배수의 값을 각각 int sum2, sum3에 저장.
//	int sum2,sum3;
//	sum2 = sum3 = 0; //값 초기화
//	for (int i = 0;i <10 ;i++ ) {
//	System.out.println(intAry[i]);
//		if(intAry[i] % 2 == 0 && intAry[i] % 3 == 0 ) {
//		   sum2 += intAry[i]
//			sum3 += intAry[i]
//		}else if(intAry[i] % 2 == 0) {
//			 sum2 += intAry[i]
//		}else if(intAry[i] % 3 == 0) {
//			sum3 += intAry[i]
//		}
//		
//		}
		
		
		