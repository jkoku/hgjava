package com.yedam.classes.inherit;

import lombok.Data;
// 이름, 연락처(Friend)
// 이름, 연락처, 학교, 전공 (UnivFriend)
// 이름, 연락처, 회사, 부서 (CompFriend)

@Data

public class Friend  extends Object{  //toString은 Object라는 클래스를 상속하고 있다/
	private String name;
	private String phone;
	
	public void changeInfo(String info1, String info2) {
		return;
	} //자식클래스에서 상속받아서 overriding하라는 의미로 메소드 생성 univ comp 만 override해서 기능을
	
	@Override //타입체크해줌 반환되는값이 부모와 메소드규칙이 같은지 확인 체크해줌 부모랑 같도록. 반환값 이름 매개값들 체크 
	public String toString() {
		return "이름은" + name + ",연락처는" + phone;
	
}
}

