package com.yedam.calsses.friend;

// 친구이름, 연락처(문자, 나이(정수, 관리.

//get set
public class Friend {
	private String fname;
	private String ftel;
	private int age;
	
	//생성자 : 기본 생성자(매개값이 없는) new Friend()	
	public Friend() {
	
	}
	public Friend(String name, String tel) {
		fname = name;
		ftel = tel;
	}
	public Friend(String name, String tel, int age) {
		this(name, tel);
		this.age = age;
	}

//메소드
	void showInfo() {
		System.out.printf("친구 이름은 %s, 연락처는 %s, 나이는%d 입니다./n", this.fname, this.ftel, this.age );
	}
	String showInfoStr() {
		return "이름은" + fname;
	}
//getter/setter
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFtel() {
		return ftel;
	}
	public void setFtel(String ftel) {
		this.ftel = ftel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}// end of class

