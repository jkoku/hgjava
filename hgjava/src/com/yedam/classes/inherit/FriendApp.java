package com.yedam.classes.inherit;
//친구정보저장, 조회, 수정, 삭제.

public class FriendApp {
	private Friend[] friends; // friends 필드선언
	public FriendApp() {
		friends  = new Friend[10]; // 10명 정도 담을수 있는 생성자 선언
	}

	// CRUD
	public boolean add(Friend fnd) {   // 상속받은 univ com 들이 들어올수있다.
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = fnd;
				return true;
			}
		}
		return false;
	}
	
	//목록, 이름(name)값이 들어오면 이름과똑같은 친구들 반환. 이름으로 안들어오면 전체 반환.
	private int idx = 0;
	public Friend[] list(String name) {
		Friend[] list = new Friend[10];
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null) {
				if(friends[i].getName().equals(name)){         // || name.equals(name);
					list[idx++] = friends[i];
				}
			}
		}
		return list;
	}
	public Friend[] list() {
		return friends;
	}
	
	
	// 전화번호(키) 단건조회.
	public Friend getFriend(String phone) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null) {
				if(friends[i].getPhone().equals(phone)){
					return friends[i];
				}
			}
		}
		return null;
	}
	
	// (단건)수정.(전화번호 - 회사: 회사, 부서/ 학교: 학교,전공)
	public boolean modify (String phone, String info1, String info2) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null) {
				if(friends[i].getPhone().equals(phone)){
					friends[i].changeInfo(info1,info2);
					return true;
				}
			}
		}
		return false;
	}
	
	//삭제(전화번호)
	public boolean remove(String phone) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null) {
				if(friends[i].getPhone().equals(phone)){
					friends[i] = null;
					return true;
				}
			}
		}
		return false;
	}


} //end of class
