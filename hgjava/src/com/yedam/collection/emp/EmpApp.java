package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		List<Employee> storage = new ArrayList<>();

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		while (run) {
			System.out.println("1.등록 2.조회(입사일자) 9.종료");
			// "23-03-01"문자열을 데이터타입으로 바꿔줘야 3이랑 비교 가능....
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 등록
				System.out.println("사번 이름 입사일자 급여");
				String[] valAry = scn.nextLine().split(" "); //split메소드로 공백을 이용해 하나씩 나누어 storage에 나누어 넣어서 들어가게해준다.
				try {										//string으로 배열선언 들어갈 타입들도 맞추어 변경.
					storage.add(new Employee(Integer.parseInt(valAry[0]), // 사번
							valAry[1], // 이름
							sdf.parse(valAry[2]), // 입사일
							Integer.parseInt(valAry[3]) // 급여) 
					));
				} catch (Exception e) {
					
				}  //date타입 들어가서 trycatch 써줌/ parseecxeption sdf.parse(valAry[2]) 파싱하면 에러.
				
				System.out.println("추가되었습니다.");
				break;
			case 2: // 조회
				Date searchCondition = null;
				while (true) {
					System.out.println("조회일 입력");
					try {
						searchCondition = sdf.parse(scn.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("날짜 포맷이 부적확.");
					}
				}
				for (int i = 0; i < storage.size(); i++) {
					if (storage.get(i).getHireDate().after(searchCondition)
							|| storage.get(i).getHireDate().equals(searchCondition)) {
						System.out.println(storage.get(i).toString());
					}
				}
				break;
			case 9:// 종료
				run = false ;
				System.out.println("종료!");
			}
		}
		System.out.println("end of prog.");
		
		
	}

	void method() {

		// "101 홍길동 23-05-08 100" 사원번호int 이름String 입사날짜 급여 nextLine으로 읽어들이기
		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		String[] valAry = val.split(" ");
		for (String value : valAry) {
			System.out.println(value);
		}
		try {
			new Employee(Integer.parseInt(valAry[0]), // 사번
					valAry[1], // 이름
					sdf.parse(valAry[2]), // 입사일
					Integer.parseInt(valAry[3]) // 급여
			);
		} catch (Exception e) {

		}
	}

}
