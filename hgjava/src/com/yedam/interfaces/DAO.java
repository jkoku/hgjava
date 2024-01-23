package com.yedam.interfaces;

public interface DAO {  //class 말고 interface로 선언
	int VER = 1;
	// 규칙. 규칙정함
	public void insert();
	public void update();
	public void delete();

	
}
