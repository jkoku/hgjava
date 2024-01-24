package com.yedam.api;

import java.text.ParseException;

public class StringTest {
	public static void main(String[] args) throws ParseException {
		// 1번문제의 데이터 2000년이전이후로 나누어야함.
		String[] jumins = { "970101-1234567" // 남자
				, "970101-2234567"// 여자
				, "9701011234567" // 남자
				, "970101 1234567" // 남자
				, "030101 4234567" // 여자
			// ,"030101 1234567" //오류 1은 2000년이전
		};

		for (String ssn : jumins) {
			checkGender(ssn);

		}

		// 2번 문제의 데이터. '길동'이라는 '이름'이 몇 번 나오는지?
		String[] names = { "김길동" //
				, "홍길동" //
				, "이상민" //
				, "김민수" //
				, "길동이" //
		};
		int cnt = 0;
		for (String name : names) {
			if (name.indexOf("길동") > 0) { // 커야지 이름이 길동 길동이 ㄴㄴ
				cnt++;
			}
		}
		System.out.println();

	}// end of main

	private static void checkGender(String ssn) throws ParseException {
		int yy = Integer.parseInt(ssn.substring(0, 2));
		boolean before2000 = yy > 23;

		char pos = ssn.charAt(ssn.length() - 7);
		String gender = "여자";

		if (before2000) {
			if (pos == '1') {
				gender = "남자";
			} else if (pos == '2') {
				gender = "여자";
			} else {
				gender = "오류";
			}
		} else { // 2000년이후
			if (pos == '3') {
				gender = "남자";
			} else if (pos == '4') {
				gender = "여자";
			} else {
				gender = "오류";
			}
		}
		System.out.println(gender);
	}

}// end of class
