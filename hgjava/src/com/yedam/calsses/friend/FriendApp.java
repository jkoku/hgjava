package com.yedam.calsses.friend;

// 등록기능. 수정기능, 삭제기능, 목록, 단건조회 기능.

public class FriendApp {
 // 필드 : 친구정보를 저장할 수 있는 배열. 
	
 Friend[] friends; 

public FriendApp() {
	friends = new Friend[10];
}	
	//등록
	public boolean add (Friend frd) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] ==  null) {
				friends[i] = frd;
				return true;
			}
		}
		return false;
	}
	//수정
	public boolean modify(String fname, String ftel) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] ==  null && friends[i].getFname().equals(ftel)) {
				friends[i] = setFtel(tel);
				return true;
			}
		}
		return false;
	}
	//삭제
	public boolean remove(String fname) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] !=  null && friends[i].getFname().equals(fname)) {
				friends[i] =  null;
				return true;
			}
		}
	return false;
	}
	// 목록
	public Friend[] list() {
		return friends;
	}
	//단건조회
	public Friend get(String name) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] !=  null && friends[i].getFname().equals(fname)) {
				friends[i] = null;
				return friends[i];
			}
		}
	}
}//end of class
