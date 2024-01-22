package com.yedam.calsses.friend;

// 친구이름, 연락처(문자, 나이(정수, 관리.

//get set
public class Friend {
	private String fname;
	private String fnum;
	private int age;
	
	public Friend() {
		
	}
	public Friend(String name, String num) {
		fname = name;
		fnum = num;
	}
	public Friend(String fname, String fnum, int age) {
		super();
		this.fname = fname;
		this.fnum = fnum;
		this.age = age;
	} 
//메소드
	void showInfo() {
		System.out.printf("친구 이름은 %s, 연락처는 %s, 나이는%d 입니다./n", this.fname, this.fnum, this.age );
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
	public String getFnum() {
		return fnum;
	}
	public void setFnum(String fnum) {
		this.fnum = fnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}// end of class

