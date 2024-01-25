package com.yedam.collection;

public class Member {
	private int mid;
	private String name;

	// 생성자.
	public Member(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}

	// 논리적으로동일:hashCode,equals
	@Override
	public int hashCode() {
		return mid;
	}

	@Override  //아이디와 이름이 같으면 같은 값으로 반환하도록. 
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member target = (Member) obj;
			return this.mid == target.mid && this.name.equals(target.name);
		}
		return false;
	}
	
	// getter/setter.
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override // generate toString
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + "]";
	}

}
