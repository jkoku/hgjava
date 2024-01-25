package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxExe {
	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		box.setObj("Hong");
		String result = box.getObj();

		Box<Integer> boxi = new Box<>();
		boxi.setObj(100);
		String resulti = box.getObj();

		List<String> list = new ArrayList<>(); //<String>: 제너릭 generic 데이터타입 일반화
		list.add("");
		
//		Box box = new Box();
//		box.setObj("Hong"); // 문자열 넘버타임 어떤것이든지 다 받을수있다.
//		box.setObj(100);
//		Integer result = (Integer) box.getobj(); // 캐스팅해야 담았던 값을 그대로 볼 수 있다

	}
}