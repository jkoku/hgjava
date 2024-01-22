package com.yedam.classes;

// 학생번호, 이름, 점수, 키
// 소개(학생번호, 이름, 점수)
public class Student {  // student는 클래스이자 데이터타입의 하나이다.
	//필드 : 객체 데이터가 저장되는 곳
	private String sno; // 초기값 null    public다른 클래스 접근가능. private는 다른 외부클래스가 접근불가.
	private String sname;
	private int score; //초기값 0
	private	double height; //초기값 0.0  
	private boolean onSchool;
	//의미없는 값들어오는 것 방지하기 위하여 public 보다 private으로하고 그러면 다른 클래스에서 못쓰니까 메소드로 쓸수 있도록 해준다.
	
	//생성자 : 기본 생성자(매개값이 없는) new Friend() , 필드와 메소드는 없을 수 있지만 생성자는 꼭 있어야한다.
	public Student(){
	
	}
		
	public Student(String no, String name) {
		sno = no;
		sname= name;
	} //public을 지우면 default 값이 되어 다른패키지에서 접근이 불가하다.
	
	public Student(String no, String name ,int score) {
		this(no,name);
		this.score= score; //같은 변수명이 있다면 this.를 붙혀 위의 score 객체임을 명시
		                   //this.를 쓰면 필드 this는 자기자신을 가르킨다.
	}
	

	public Student(String sno, String sname, int score, double height) { super(); 
	//super는 부모를 가르킴. 클래스는 또다른 클래스를 상속받을 수있다. 모든 클래스는 오브젝트라는 제일 상위 클래스를 상속받는것이 전제되어있다. class에 Extend object는 숨겨져있다. 
		this.sno = sno;
		this.sname = sname;
		this.score = score;
		this.height = height;
	} //생성자 호출 - 우클릭 - 소스 - generate constructor using fields.. - generate

	//메소드 : 객체의 동작에 해당하는 실행블록 메소드는 반환값을 반드시 명시해야한다.
	//void는 반환값이 없다는 의미 리턴구문이 따로 없다. 같은 변수명이 있다면 this.를 붙혀 객체임을 명시하면됨.
	public void showInfo() {
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d입니다.\n",this.sno, sname,score );
	}
	String showInfoStr() {
		return "번호는" + sno;
	}
	//getter/setter.
	public void setHeight(double height) {
		if(height < 0) {
			this.height= 160;
		}else {
			this.height = height;
		}
	}
	public double getHeight() {  //두단어조합일때두번째단어는 맨 앞 대문자.
		return this.height;
	}	
	// sno,sname, score 작성  우클릭 -source- generate getter and setters... 
	//getter/setter는 대체로 만들어 사용하니까 알아둘 것.
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isOnSchool() {
		return onSchool;
	}

	public void setOnSchool(boolean onSchool) {
		this.onSchool = onSchool;
	}

	
	
}
