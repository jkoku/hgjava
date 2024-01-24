package com.yedam.api;

public class Member extends Object{
	String name;
	int age;

	Member(){}
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode(){
		return this.name.hashCode();
		}
	
	
	// 물리적으로는 동일하지만 논리적으로 비교해서 같게해주기위한 방법
	// name,age 같으면 논리적으로 동일한 객체. equals 메소드를 정의하면됨  

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member target = (Member) obj;
			if(this.name.equals(target.name) //
					&& this.age == target.age) {
				return true;
			}
		}
		return false;
		}		
	@Override	
	public String toString() {
	 return "이름은" + name + "나이는" + age;
	}

}

	
