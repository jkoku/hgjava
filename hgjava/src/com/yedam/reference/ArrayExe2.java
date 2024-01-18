package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {
	public static void main(String[] args) {
		
		String[] friends = {"홍길동","김민수","박석민","최홍만","김길동"};
		double[] dblAry = {67.3, 72.5, 88.3, 79.3, 90.4};
		int [] students = new int[5];
		students[0] = 72;
		students[1] = 87;
		students[2] = 95;
		students[3] = 62;
		students[4] = 89;
		
		// 점수가 제일 높은 학생의 이름과 몸무게가져오기.
		int maxs = 0;
		int idx =0;
		for(int i = 0; i< students.length; i++) {
			if(maxs < students[i]){
				maxs = students[i];
				idx = i;
			}
		}
		System.out.printf("점수가 높은 학생의 이름은 %s , 몸무게는 %.1fkg 입니다.", friends[idx], dblAry[idx]);
		System.out.println();
		
		
		int max = 0;
		String names = "";
		double weight = 0;
		for (int i=0;i < students.length;i++ ) {
			if (max < students[i]) {
				names = friends[i];
				weight = dblAry[i];		
				max = students[i];
			}	
		}
		System.out.printf("최고점수 이름: %s, 몸무게: %.1f", names,weight);
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("친구입력>>>");
		String name = scn.nextLine();
		//김민수는 72.5kg, 92점 있습니다.
		for(int i = 0; i< friends.length; i++){
			if(friends[i].equals(name)){
				System.out.printf("%s의 몸무게는 %.1fkg 점수는 %d점 입니다.", friends[i], dblAry[i], students[i]);
			}
		}
		System.out.println("\nend of prog.");
	
		//김민수는 2번째 있습니다.
		boolean isExist = false;
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].equals(name)){
				System.out.printf("%s 는 %d 번째에 있습니다.", name , (i+1));
				isExist = true;
			}
		}
		if(isExist == false) { //또는!isExist //false
			System.out.println("찾는친구가 없습니다.");
		}
		System.out.println("\nend of prog.");
	}
		
			
public static void method2(String[] args) {
			double[] dblAry = {67.3, 72.5, 88.3, 79.3, 90.4};
			//배열의 값 중에서 제일 큰 값을 출력.
			double max = 0 ;
			for(int i =0; i <dblAry.length; i++) {
				if(max < dblAry[i]){
					max = dblAry[i];
				}
			}
			System.out.printf("제일 무거운 몸무게 : %.1f입니다." , max);
						
		double avg = 0;
		double sum = 0;
		for(int i=0; i < dblAry.length ; i++) {
			sum += dblAry[i];
		}
		avg = sum / dblAry.length;		
		// 친구의 평균 몸무게는 79.6 입니다.
		System.out.printf("친구의 평균 몸무게는%.1f입니다." , avg);
		System.out.println("\nend of prog."); 		
	}	

	

public static void method1(String[] args) {
	int [] scores = new int[10]; // 10개의 공간에 0이라는 크기로 각각들어가있음
	System.out.println(scores[0]);
		
		scores[3] = 40; //10개짜리 배열의 크기일때 40으로 할당된것인데 아랫줄에서 다시 선언했기 때문에 0으로 뜬다.
		scores = new int[5]; // 나중에 숫자가 바뀌면 i<10을 i <scores.length로 바꿔서 이용
		scores[4] = 50;	
		
		for (int i =0 ; i <scores.length ; i++) {
			System.out.println("scores["+i+"] =>" + scores[i]);
		}
		
		int [] students = new int[5];
		students[0] = 72;
		students[1] = 87;
		students[2] = 81;
		students[3] = 62;
		students[4] = 89;
		
		//"80점 이상인 학생은 3명입니다."
		//"90점 이상 학생은 없습니다."
		int cnt = 0;
		for (int j =0 ; j < students.length ; j++) {
			System.out.println("students["+j+"] => " + students[j]);
		if (students [j] > 80) {
			System.out.println("인덱스:" + j);
			cnt++;
			System.out.printf("80점 이상인 학생은 %d 명입니다", cnt);
		}
		}	
	}
}

