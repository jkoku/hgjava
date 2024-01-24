package com.yedam.api;

import java.util.ArrayList;
import java.util.List;

public class WrapperExe {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); //<Integer> 타입파라메터
		//List<int> lnist; // 기본데이터타입은 컬렉션으로 올 수없다.  그래서 해당되는 해당타입에대한 클래스가 필요함 = wrapperclass
		list.add(Integer.valueOf(1)); //기본타입 <-> 래퍼클래스 박싱이 일어남. 숫자 1이지만 new integer(1) 과같다.
	
		double d1 = Double.valueOf("2.3"); // 자동으로 박싱과언박싱이 빈번하게 일어난다.정상적으로 타입을 맞춰
	
		System.out.println(Math.round(2.1)); // Math클래스
		
	}
}
