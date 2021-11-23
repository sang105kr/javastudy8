package com.kh.exam6;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws OverAgeException {
		
		if(age > 0 && age < 100) {
			this.age = age;
		}else {
			throw new OverAgeException("나이가 0~100범위 초과!!",age);
		}
	}
	
}
