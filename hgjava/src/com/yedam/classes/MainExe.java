package com.yedam.classes;

import java.util.Scanner;

public class MainExe {
	
	static Scanner scn = new Scanner(System.in); //필드도 static으로 메소드마다 각각사용가능하다.
	static String sno= "", sname="";
	static int score = 0;
	static double height = 0;
	
	//등록메소드.
	public static void insert() {
		
		System.out.println("학생 번호 >>>");
		sno = scn.nextLine();
		System.out.println("학생 이름 >>>");
		sname = scn.nextLine();
		System.out.println("학생 점수 >>>");
		score = Integer.parseInt(scn.nextLine());
		System.out.println("학생 키 >>>");
		height = Double.parseDouble(scn.nextLine());
		
		//매개값으로 사용
		Student std = new Student(sno, sname, score, height); //인스턴스
		
//		StudentApp.add(std); //student 타입이 하나 만들어줌(바로위 매개값사용 괄호안에 std 넣어줌) true는 넣었다 false는 공간이 없어서 못넣었다.		
		if(StudentApp.add(std)) {      //잘넣었으면 메세지 입력
			System.out.println("입력성공!!");
		}else {
			System.out.println("입력실패!!");
		}
	}//end of insert();
	
	public static void list() {
		Student[] list =  StudentApp.list();//리스트타입지정 
		for (int i = 0 ; i < list.length; i ++) {
			if(list[i] != null) {
			list[i].showInfo();
			}
		}
		System.out.println("조회완료!!");
	}//end of list();
	
	public static void update() {
		System.out.println("학생 번호 >>>");
		sno = scn.nextLine();
		//정상적인 학번 체크
		if (StudentApp.get(sno) != null) {
			System.out.println("학생 번호 확인!!");
			return; //메소드의 종료.
		}					
		// 정상적인 점수 입력 /점수가 마이너스 이면 잘못된 값이니까 알려주는 기능 추가 
		while(true) { 
		System.out.println("학생 점수 >>>");
		score = Integer.parseInt(scn.nextLine());  
			if(score < 0) {
			System.out.println("점수를 확인하세요!!");
		 	continue;
			}
			break;
		}
		if(StudentApp.modify(sno,score)) {
			System.out.println("수정완료!!");
		}else {
			System.out.println("점수를 확인하세요!!");
		}
	}//end of update();
	
	public static void delete() {
		System.out.println("학생 번호 >>>");
		sno = scn.nextLine();
		if(StudentApp.remove(sno)){
			System.out.println("삭제완료!!");
		}else {
			System.out.println("잘못된 학번입니다!!");
		}
	}// end of delete.
	
//	public static void search() {
		
//	}//end of search.6. 단건조회
	
public static void main(String[] args) {

//		StudentApp app = new StudentApp(); //제일 처음에 가져다 쓸 기능 선언 app이라는 참조변수에 할당
//		app.get()-> StudentApp.get()
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제  9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: // 등록기능
				insert();
				break;
			case 2: //목록
				list();
				break;
			case 3: //수정	
				update();
				break;				
			case 4 ://삭제
				delete();
				break;				
			case 9 : //종료
				run = false ;
				System.out.println("종료합니다!!");
			}
		}
	System.out.println("end of prog");
	}	// end of main()
}
