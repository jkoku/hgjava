package com.yedam.exceptions;

public class RuntimeExe2 {
	public static void main(String[] args) {
	
	// 실행예외.
		String str ="10";	
		
		str = null;
		try {
			str = "ten";
			System.out.println(str.toString()); //NullPointer
			int num = Integer.parseInt(str); 	//NumberFormat
		} catch(NullPointerException ne){
			//ne.printStackTrace(); // ne는 변수 ne가가진 기능중에 에러발생시 에러발생구문띄워주는 printStackTrace
			System.out.println("참조값이 없음.");
		}catch(NumberFormatException ne2) {
			//ne2.printStackTrace(); 
			System.out.println("숫자값이 아님.");
		}catch(Exception e) {  //Exception이라는 상위존재클래스가 마지막에 오도록
			System.out.println("알수없는 예외");
		}
	
	
	System.out.println("end of prog.");
	
	}
}
