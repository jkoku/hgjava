package com.yedam.classes;

// 학생의 정보를 관리하는 기능 구현.  기능을 잘 활용하기 위한 용도 StudentApp  필드 생성자 이런애들 멤버.
public class StudentApp { 
//필드. 학생의 공간 담아넣는 곳
	
	private static Student[] students; // null, students 필드 선언.
	
//생성자.static ㄴㄴ
	public StudentApp(){
		students = new Student[10];  //크기를 정하는 기능 넣음
	}
	
	//students = 메모리할당
	static {
		students = new Student[10];
	}

	
	//메소드 기능은 메소드로 구현이 된다. crud
	//등록기능 여기서 구현한 기능은 main이라는 기능에서 호출 할 예정 
   //괄호안의 매개변수 활용 student라고하는 4개의 값을 매개변수 4개 넣거나(String sno,String sname..) 뒤처럼 넣기  ex. (Student std)
//등록
	public static boolean add (Student std) {
		for(int i = 0 ; i< students.length; i++) {
			if(students[i] ==  null) {
				students[i] = std;
				return true; // 비어있는 공간이 없으면 true반환이 안될 수 있어서 규칙에 어긋나서 오류 return false도 써줄것
			}
		}
	return false;
	//System.out.println("입력성공!"); 
	//void 반환값은 잘입력되었으면 필요에따라 메세지는 메인에서 바꿔주는게 코드 중복되지않고 좋다.
	//처리된 결과가 잘되었으면 트루폴스로 값 반환. 메인에서메시지 설정 sysout말고 

	}
//목록.
		public static Student[] list() {
			return students;
		}

//수정. 점수만수정 (학생번호- 점수) 두개를 매개값으로 받도록한다. students안의 값을 다 뒤져서 수정.
		public static boolean modify(String sno, int score) {
			for (int i = 0; i < students.length; i++) {
				if(students[i] == null && students[i].getSno().equals(sno)) {  //null이 아니어야하고 가지고온 학생번호랑 매개벊수랑 비교해서 같은게 있으면 스코어로 값을 바꾸어주야한다.값을 바꿀때는 셋메소드 만들어둠
					students[i].setScore(score);
					return true; // 잘꾸었다
				}
			}
			return false; //못바꿈 학생번호중에 그러학생이 없다는 의미
		}
		
//삭제(학생번호) 매개값은 학생번호 . 찾아보고 있으면 그 배열의 값을 null로 바꾸면 삭제
		public static boolean remove(String sno) {
			for (int i = 0; i < students.length; i++) {
				if(students[i] !=  null && students[i].getSno().equals(sno)) {
					students[i] = null;
					return true;
				}
			}
		return false;
		} 
//단건조회(학생번호) 매개변수 Student와 String no을 구분해서 사용할 수 있도록.
		public static Student get(String sno) {
			for (int i = 0; i < students.length; i++) {
				if(students[i] !=  null && students[i].getSno().equals(sno)) {
					students[i] = null;
					return students[i];
				}
			}
		return null;
		}
}
