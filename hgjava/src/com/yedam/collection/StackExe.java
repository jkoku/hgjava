package com.yedam.collection;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김민석");
		stack.push("최만석");

		stack.pop(); // 제거.
		while (!stack.isEmpty()) { // isEmpty() 비어있는지 체크하는 용도
			String result = stack.pop(); // peek는 스택에서 제거를하지않는다. 무한반복
			System.out.println(result);
		}

		// home->product->sell->시점.

	}
}
