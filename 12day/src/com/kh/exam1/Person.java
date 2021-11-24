package com.kh.exam1;

public class Person {
	
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if( obj instanceof Person) {
			if(this.age == ((Person)obj).age) {
				result = true;
			};
		}
		
		return result;
	}

}
