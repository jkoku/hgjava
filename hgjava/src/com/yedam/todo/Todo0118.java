package com.yedam.todo;

import java.util.Scanner;


public class Todo0118 {
private static String scoreInput;
private static String weightInput;

// FriendExe의 등록시 정상처리가 되도록 구현하기.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true; //사용자가 종료라는 말을 하기 전까지는 반복
		Friend [] friends = new Friend[5]; // {null,null,null,null,null} 객체값의 현재 모양
		
		int score = 0;
		double weight = 0;
		
		while(run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.점수조회 6.분석 9.종료");

			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1: // 등록. 
				System.out.print("이름>>>");
				String name = scn.nextLine();
				if(name.equals(" ")) {
					System.out.println("이름을 입력하세요");
					break;
				}
				System.out.print("몸무게>>>");
				weightInput=scn.nextLine();
				weight = Double.parseDouble(scn.nextLine()); 
				if(weight.trim().isEmpty()) {
					System.out.println("몸무게를 입력하세요");
					break;
				}
				System.out.print("점수>>>");
				score = Integer.parseInt(scn.nextLine());
				if(scoreInput.trim().isEmpty()) {
					System.out.println("점수를 입력하세요");
					break;
				}
				
				Friend friend = new Friend();// 3개 정보를 friend에 넣기 위한 초기화
				friend.name = name;
				friend.weight = weight;
				friend.score = score; 
			
				//friends[0] = friend; //비어있는 위치 찾아서 한 건 입력하고 종료.
				for(int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				System.out.println("정상적 입력.");
				break; // break를 해서 등록기능 마침
			
			case 2: //조회.
				//전체목록.. 이름:홍길동 몸무게:77.2 점수:80점.
				for(int i =0; i < friends.length; i++) {
					if(friends[i] != null) {
						System.out.printf("이름은 %s 몸무게는 %.1fkg 점수는 %d 입니다.",friends[i].name, friends[i].weight,friends[i].score);
					}
				}
				break;
			case 3:// 수정
				//친구이름 입력 -> 점수 수정 
				weight = -1;
				score = -1;
				System.out.print("조회할 이름>>>");
				name = scn.nextLine();
				
				//존재여부 체크.
				boolean isExist = false;
				for(int i = 0; i < friends.length; i++) {
					if(friends[i] != null && friends[i].name.equals(name)) {
						// 추가정보 .. 입력
						System.out.print("수정 몸무게>>>");
						String sweight = scn.nextLine();
						if(!sweight.equals("")) {                   //  공백이 아닐때라는 의미의 조건 만듬
							weight = Double.parseDouble(sweight);  //  weight 바꿈
						}	
						System.out.print("수정 점수>>>");
						String sscore = scn.nextLine();           //  값을 넣는다.
						if(!sscore.equals("")) {                 //  공백이 아닐때
							score = Integer.parseInt(sscore);   //  스코어라는 변수에 담아주겠다.
						}
						
						friends[i].score = (score != -1) ? score : friends[i].score; 
						friends[i].weight = (weight != -1) ? weight : friends[i].weight;
						isExist = true;
					}
				}
				if(!isExist) {
					System.out.println("찾는이름이 없습니다.");
				}else{
					System.out.println("수정완료");
				 }
				break;
			
			case 4: //삭제  :값이 없으면(null) 삭제라는 뜻. 값이 있는 곳에 null 넣기.
				System.out.print("조회할 이름>>>");
				name = scn.nextLine();	
				for(int i = 0; i < friends.length; i++) {
					if(friends[i] != null && friends[i].name.equals(name)) {
						friends[i] = null;
						break;  // 반복문에 대한 종료
					}
				} 
				System.out.println("삭제완료!");
				break; // case에 대한 종료
			
			case 5://5.점수조회: 입력한 점수를 기준으로 이상인 친구들만 출력하도록. 70점 입력하면 70점 보다 높은친구들 보여주기 
				System.out.print("점수>>>");
				score = Integer.parseInt(scn.nextLine());
				for(int i =0; i < friends.length; i++) {
					if(friends[i] != null && friends[i].score >= score) {
						System.out.printf("더 높은 점수의 친구이름은 %s\n ", friends[i].name );
					}	
				}
				break; // case에 대한 종료
			
			case 6 : //6.분석: 점수들 입력하면 평균점수:85 최고점수:90점 	
				
				int cnt = 0;
				int max = 0; // int cnt = 0; int max = 0; 두번 쓰는걸 한번에 쓸수있음
				double avg = 0;
				double sum = 0; // double avg = 0; double sum = 0;
				
				for(int i =0; i < friends.length; i++) {
					if(friends[i] != null && max < friends[i].score) {
						max = friends[i].score;
					}
					if(friends[i] != null) {
						sum += friends[i].score;
						cnt++;                   
					}				
				}
				avg = (double) sum / cnt;						
//				System.out.printf("평균점수는 : %.1f점 최고점수는 : %d점 " ,max ,avg );
				System.out.printf("최고점수는 : %d점 ", max); System.out.printf("평균점수는 : %.1f점 \n" ,avg );
				break; // case에 대한 종료
				
			case 9: //종료	
				run = false;
				System.out.println("종료합니다.");
			}// end of switch
		}//end of while
		System.out.println("\nend of prog");
	}//end of main
}
