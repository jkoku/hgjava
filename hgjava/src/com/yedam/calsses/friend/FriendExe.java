package com.yedam.calsses.friend;

import java.util.Scanner;

public class FriendExe {
public static void main(String[] args) {
//메뉴: 1.등록 2.목록 3.수정 4.삭제 9.종료.
//사용자의 입력/ 처리결과 콘솔출력. 	
	
	// 다른기능이 필요한 경우.
	//로그인 기능 (id.pw.name)
	Scanner scn = new Scanner(System.in);
	
	FriendApp app = new FriendApp();
	
	UserApp uapp = new UserApp();
	
	while(true) { 
		System.out.println("id");
		String id = scn.nextLine();
		System.out.println("pw");
		String pw = scn.nextLine();
		
		User user = uapp.login(id, pw);
		
		if (user != null) {
		System.out.printf("%s 님,환영합니다." , user.getName());
		break;
		}
	System.out.println("id와pw확인");	
	}
	
}
	
	Scanner scn = new Scanner(System.in);
	boolean run = true;
	
	String fname="", ftel="";
	int age = 0 ;
	
	while(run) {
		System.out.println("1.등록 2.목록 3.수정 4.삭제 9.종료");
		int menu = Integer.parseInt(scn.nextLine());
		
		switch(menu) {
		case 1 : // 등록
			System.out.println("친구이름>>");
			fname = scn.nextLine();
			System.out.println("친구 연락처>>");
			ftel = scn.nextLine();
			System.out.println("친구 나이>>");
			age = Integer.parseInt(scn.nextLine());
			
			Friend frd = new Friend(fname, ftel, age);
			app.add(frd);
			
			if(app.add(frd)) {
				System.out.println("입력성공!!");
			}else {
				System.out.println("입력실패!!");
			}
			break;
		}	
	}

	//다른 기능이 필요한 경우. 
	//로그인

	}//end of main
}//end of class
