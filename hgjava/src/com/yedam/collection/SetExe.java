package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("홍길동");
		names.add("김길동");
		names.add("손흥민");

		names.remove("손흥민");
		System.out.println(names.size());

		Iterator<String> iter = names.iterator(); // iterator() 반복요소를 가져와서 담아줌. 아니면 확장 for
		while (iter.hasNext()) { // 가져올 대상이 있는지 체크하는 메소드.
			String result = iter.next(); // 하나를 선택해서 가져옴. 순서를 알 수없다.
			System.out.println(result);
		}
		
		// 확장 for.
		for(String name : names) {
			System.out.println(name);
		}
		
		int[] numbers = {10, 20, 30, 20};
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < numbers.length; i++ ) {
			set.add(numbers[i]);
		}		
		for(int num : set) {
			System.out.println(num);  // set컬렉션 사용: 중복된 값은 제외해서보겠다.
		}
		
	}
}
