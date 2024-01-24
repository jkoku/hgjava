package Chapter11;

public class StringIndexOfExample {
	public static void main(String[] args) {
	 String subject = "자바 프로그래밍";
	 
	 int location = subject.indexOf("프로그래밍");
	 System.out.println(location);
	 
	 	if(subject.indexOf("자바") != -1) {
		 System.out.println("자바와 관련된 책이군요"); //문자가 포함되어있는 경우
	 	} else {
		 System.out.println("자바와 관련없는 책이군요"); // -1값을 리턴하면 포함되어 있지않은 경우
	 	}
	}
}
