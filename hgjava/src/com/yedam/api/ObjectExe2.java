package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

public class ObjectExe2 {
	public static void main(String[] args) {
		Set<String> set  = new HashSet<String>(); //문자열담을 데이터 공간하나 만들겠다. set은인터페이스
		set.add("김길동");
		set.add("박길동");
		set.add("홍길동");
		set.add("박길동"); // set 컬렉션 특징 : 동일한 값은 담지않는다. 중복저장X 그래서 박길동은 1번만 출력. 		
		for(String name : set ) { // for..of 뒤에오는건 컬렉션이나 배열. String name 은 set(컬렉션)에 있는걸 받아오기 위한 변수
// 			System.out.println(name);
		}
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김길동", 20));
		members.add(new Member("홍길동", 22));
		members.add(new Member("박길동", 24));
		members.add(new Member("김길동", 20));
		for(Member mem : members) {
			System.out.println(mem.toString());
		}
	}
}
