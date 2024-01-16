package com.yedam.variable;

public class VariableExe1 {
	public void sum() {                    //중괄호는 블럭이라 한
		int n2; 
	}
	public static void main(String[] args) { 
		//let n ='10';
		//const obj = {name:"홍길동", age:20, showInfo(){}}
		int n1 = 217978988;// int(기본데이터타입) wrapper클래스: Integer.
		n1 = -21797898;
		System.out.println(Integer.MAX_VALUE);
		
		long n2 = 2179789898L;
		n2 = -2179789898L;
		
		double	n3=Math.random(); //0 ~ 1 임의실수.
		
		int n4 = (int)(Math.random()*10); // //0 ~ 1 임의실수
		
		String str = "홍길동";
		//홍길동이라고 하는 값이 들어있지않고 객체의 번지값을 가지고있다. 
		//클래스에 의해 만들어지는 객체의 주소값을 가짐. 
		
		//	int n2;  선언불가 두번 선언이 불가. 위에 n2 있음.
		
		byte b1 = 127;
		System.out.println(Short.MAX_VALUE);
		short s1 = 32767;
		
		short s3 = (short) (s1 - 30) ; // 연산의 기준은 int  오왼타입이 항상같아야한다
		//왼쪽항 = 오른쪽항 : 항상 타입이 동일.
		double d1 =(double) 40; //형변환 
		
		
		
		
	}
}

