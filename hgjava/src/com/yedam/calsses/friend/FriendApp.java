package com.yedam.calsses.friend;

// 등록기능. 수정기능, 삭제기능, 목록, 단건조회 기능.

public class FriendApp {
 // 필드 : 친구정보를 저장할 수 있는 배열. 
	private static Friend[] friends;
	
	public FriendApp() {
		friends = new Friend[10];
	}
	static {
		friends = new Friend[10];
	}
	//등록
	public static boolean add(Friend frd) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = frd;
				return true;
			}
		}
		return false;
	}
	//수정
	public static boolean modify(String fname, String fnum) {
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getFname().equals(fname)) {
				friends[i].setFnum(fnum);
				return true;
			}
		}
		return false;
	}
	//삭제
	public static boolean remove (String fname) {
		for(int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFname().equals(fname)) {
				friends[i] = null;
				return true;
			}
		}
		return false;
	}

	// 목록
	public static Friend[] list() {
		return friends;
	}

	//단건조회
	public static Friend get(String fname) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getFname().equals(fname)) {
				friends[i] = null;
				return friends[i];
			}
		}
		return null;
	}
}//end of class
