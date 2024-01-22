package com.yedam.classes;

//상속의 장점 같은 데이터형으로 취급해줌
public class HighStudentExe {
	public static void main(String[] args) {
		HighStudent hiStd =
				new HighStudent("T001","홍길동",90,"김쌤");
		System.out.println(hiStd.getSno());
		hiStd.showInfo(); //부모클래스가 가지고 있는 멤버:부모클래스가 가진 기능 그대로 물려받도록하겠다.
		
		System.out.println("-----------------");
		//부모클래스의  참조변수에 자식클래스의 인스턴스를 대입.
		Student std = (Student) new HighStudent("T002", "박길동",80,"김쌤"); //(Student)는없어도됨
		if (std instanceof HighStudent) {
			HighStudent hstd = (HighStudent) std; //Student타입 (HighStudent)있어야함
			// 자식타입    변수
			System.out.println(hstd.getTeacher()); // 가지고 있는 메소드는 쓸 수 없다.부모가가진기능만 사용가능. 자식이 가진 기능은 불가
		}
	
		
		Student std1 = new Student("S003","박석민",80);
		if(std1 instanceof HighStudent) {
			HighStudent hstd1 = (HighStudent) std1;  // 실행해보면 담겨진 인스턴스가 자식인스턴스가 맞으면 자식이 환원이 된다. 형변환을 할때 담겨진 std1 타입이 histudent로 바꿀수있는 타입인지 
		System.out.println(hstd1.getTeacher());
		}
		
		
		System.out.println("=============================");
		Student[] students = new Student[10];
		// HighStudent[] hiStudents = new HighStudent[10];
		students[0] = new Student("S001","김민석",90);
		students[1] = hiStd; //HighStudent
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				students[i].showInfo();
			}
		}
		
		long ln1 = (int) 10;  // 자동형변환(promotion)큰 범위의 변수 = (큰 범위 변수) 작은 범위값
//		int n1 = (int) ln1 // 강제형변환(casting)
	}
}
