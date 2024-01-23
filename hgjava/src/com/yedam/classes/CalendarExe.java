package com.yedam.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	public static void main(String[] args) {
		final int num = 10;
		//num =20;
		Calendar cal = Calendar.getInstance();
//		Calendar cal2 = Calendar.getInstance();
//		System.out.println(cal1 == cal2); 
		cal.set(2024, 1, 1);
//		System.out.println("year: " + cal.get(Calendar.DAY_OF_WEEK)); // DAY_OF_WEEK =상수필드 해당되는값반환 1월은 0부터시작
//		System.out.println("last Date : " + cal.getActualMaximum(Calendar.DATE)); //1월달 마지막날.  getActualMaximum 말일값을 가죠옴.
		
		//drawCalendar(2024, 1); //
		Date date = new Date(); //1900년이 시작시점.
		//2024-10-5
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
		date = sdf.parse("2024-01-01"); //String -> Date  parsing이 해석해서 date라는 객체를 만들어줌. 2024.1.1 
		}catch(Exception e) {
			e.printStackTrace();
		}
		//System.out.println(date.getMonth()); //곧 폐기될거라서 줄그여져있음.	
	}
	
	// drawCalendar(2024, 1)
	//2024-03-01 하면 해당월이 나올수 있도록.. 오버로딩 같은메소드이름 여러개 정해서쓰는데
	static void drawCalendar(Date date) {
		
	}
	
	
	
	static void drawCalendar(int year, int month) {
		//(2024, 1)
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1 , 1 ); //set 이 연월일 넣게하는 메소드 /1일에 요일정보부터필요하니까
		
		
		int pos = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		//요일 출력.
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for (int i = 0; i < days.length;i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println("");
		// 1일의 요일지정.
		for(int i = 0; i < pos; i++) {
			System.out.printf("%4s", "");
		}		
		// 날짜출력.
		for (int d = 1; d <= lastDate; d++) {
			System.out.printf("%4d", d);
			if((pos + d) % 7 == 0) { 
				System.out.println();
			} 
		}
		System.out.println();
		System.out.println ("=======end of prog=======");
	}
}
