package com.yedam.classes.inherit;

import java.util.Scanner;

public class FriendExe {
	// 사용자 입력/처리결과 출력 => 컨트롤.
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		FriendApp app = new FriendApp();
		while(run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			case 1 : // 등록. 1)이름연락처 2)학교친구 3)회사 구분해줘야함.
				System.out.println("1.친구 2.회사 3.학교");
				int subMenu = Integer.parseInt(scn.nextLine());
				
				System.out.print("이름>>> ");
				String name = scn.nextLine();
				System.out.print("연락처>>> ");
				String phone = scn.nextLine();
				
				Friend friend = null;  // 한번에 처리가능
				if(subMenu == 1) {
					friend = new Friend();
					friend.setName(name);
					friend.setPhone(phone);
					
				}else if(subMenu == 2) {
					CompFriend cfriend = new CompFriend();
					cfriend.setName(name);
					cfriend.setPhone(phone);
					
					System.out.print("회사>>> ");
					String company = scn.nextLine();
					System.out.print("부서정보>>> ");
					String dept = scn.nextLine();
					cfriend.setCompany(company);
					cfriend.setDept(dept);
				
					friend = cfriend;
					
				}else if(subMenu == 3) {
					UnivFriend ufriend = new UnivFriend();
					ufriend.setName(name);
					ufriend.setPhone(phone);
					
					System.out.print("학교>>> ");
					String univ = scn.nextLine();
					System.out.print("전공>>> ");
					String major = scn.nextLine();
					ufriend.setUniv(univ);
					ufriend.setMajor(major);
				
					friend = ufriend;
		
				}
				
				if(app.add(friend)) {//추가
					System.out.println("정상등록");
					}else {
						System.out.println("등록 안됨");
					}
					break;
			
			case 2: //목록이름
					System.out.println("조회할 이름>>>"); // 홍길동 / ""
					String fname =scn.nextLine();
					Friend[] list;
					if(fname.equals("")) {
						list = app.list();
					}else{
						list = app.list(fname);
					}
					for (int i = 0; i < list.length; i++) {
						if(list[i] != null) {
							System.out.println(list[i].toString());
						}
					}
					break;
					
				case 3: //수정.
				
					String fphone = scn.nextLine();
					Friend frnd = app.getFriend(fphone);
					String info1 ="", info2 = "",
					if(frnd instanceof UnivFriend)
						System.out.println("학교");
					info1 = scn.nextLine();
					System.out.println("전공");
					info2 =scn.nextLine();
					else  if(frnd instanceof CompFriend) {
						System.out.println("회사");
						info1 + scn.nextLine();
						System.out.println("부서")
						info2 = scn.nextLine();
					}
					
					
					System.out.println("수정할 연락처>>>");
					phone = scn.nextLine();
					System.out.println("수정할 회사명>>>");
					String info1 = scn.nextLine();
					System.out.println("수정할 부서명>>>");
					String info2 = scn.nextLine();
					if(app.modify(phone, info1, info2)) {
						System.out.println("변경완료");
					}else {
						System.out.println("변경실패");
					}
					break;
				case 4: //삭제.
					System.out.println("삭제할 연락처>>>");
					 phone= scn.nextLine();
					if(app.remove(phone)) {
						System.out.println("삭제완료!");
					}else {
						System.out.println("삭제실패");
					}
					break;
				case 9:
					System.out.println("종료합니다.");
					run = false;
					
					
			}// end of switch 
		}// end of while.
		
		System.out.println("end of prog.");
	}
	
}
