package com.yedam.classes;

//담임 선생님.
public class HighStudent extends Student{
	private String teacher;
// 생성자
//	public HighStudent(){
//		super();
//	}
	public HighStudent(String sno, String name) {
		super(sno,name);
	}
	
	public HighStudent(String sno, String name, int score,String teaher) {
		super(sno, name, score);
		this.teacher  = teacher;
	}
// getter/setter.
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	// 부모메소드를 재정의(overriding)
	public void showInfo() {
		//자식 클래스 : teacher추가 출력.
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d, 선생님은 %s 입니다.\n"
						,this.getSno(),getSname(),getScore(),teacher ); 
		 //super.sno 불가  sno값이 private/ 메소드로가져오기 부모가가진 멤버들을 물려받았기때문에 this.
	}
	
	
}
