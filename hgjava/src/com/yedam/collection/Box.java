package com.yedam.collection;

public class Box <T>{ //나중에 정해질거니까 지금은 T로 선언 타입파라메터: 타입을 나중에 정하겠습니다.
	T obj;
	
	void setObj(T obj) {
		this.obj =  obj ;
	}
	
	T getObj() {
		return obj;
	}
	
}
