package Chapter11;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "8808081234123";
		
		String firstNum = ssn.substring(0,6); //0(포함)~6(제외) 사이의 문자열 추출
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
