package com.yedam.classes;

//import package 동일한 패키지내에 있다면 / import 불필요하지만 다른 패키지에 있다면 import 해줄것

public class StudentExe {
 public static void main(String[] args) {     //main메소드 : class가 호출되면 바로 실행되는 메소드. 
	Student s1 = new Student("S001","홍길동",80,178.9);//인스턴스생성.생성자. 
//	s1.sno = "S001";
//	s1.sname = "홍길동";
//	s1.score = 80;
//	s1.height = -168;
//	System.out.println(s1.sno);
	s1.setHeight(- 167);           // 각각의 필드값을 바꿔주기 위한 메소드를 만들어주어야 사용할 수 있따.
	System.out.println(s1.getHeight());
	s1.showInfo();
	
	Student s2 = new Student("S002","김길동");
//	s2.score =85;
	s2.showInfo();
	
	Student s3 = new Student("S003","박길동",90);
	s3.showInfo();
	
 } 
}
