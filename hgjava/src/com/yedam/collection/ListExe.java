package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();//타입미리정함
		names.add("홍길동");
		names.add("김민석"); // 중복입력허용. 인덱스값으로 데이터처리하기때문
		names.add("김민석"); // 길동 민석
		names.add(1,"이만수"); // 길동 만수 민석
		names.add(1,"이만우"); // 길동 만우 만수 민석
		names.set(1,"김만우"); // 길동 김만우 이만수 민석 /1위치에 김만우지정
		names.remove(1); // 한건삭제.
//		names.clear();
		
		System.out.println(names.size()); // 컬렉션 크기확인
		
		// 반복문.
		for(String name : names) { 
			System.out.println(name);
		}
		
//		if(names.size() > 2) {
//			System.out.println(names.get(1)); // 배열이면 names[1] 여기서는 get메소드사용
//		}	
		
		List<Member> members = new ArrayList<>(); // members 담을 List컬렉션 선언.
		members.add(new Member(1,"홍길동")); // 멤버인스턴스 담는다. 멤버라는 클래스의 인스턴스만 담도록.같은형식으로 담아야한다.
		members.add(new Member(2,"김민석")); // 4. 김길동
		members.add(new Member(3,"이충희"));
		
		for(int i = 0; i < members.size(); i++) {
			String name = members.get(i).getName(); // Member member = members.get(i) string아니고 member타입
			int id = members.get(i).getMid(); //타입구분
//			System.out.printf("이름: %s, 아이디:%d\n",name, id);
			System.out.printf("%s\n",members.get(i).toString());
		}
		for(int i = 0; i < members.size(); i++) {
				if(members.get(i).getName().equals("김민석")){
					members.set(i, new Member(4,"김길동")) ;
					
				}
		}
	}
}
