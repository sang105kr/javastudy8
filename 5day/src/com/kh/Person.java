package com.kh;

// 클래스
public class Person {

	//멤버 필드
	private String name;
	private int age;	
	private Gender gender;
	Calculator calculator = new Calculator();
	
	//디폴트 생성자
	public Person() {}
	
	public Person(Calculator calculator) {
		this.calculator = calculator;
	}
	
	//생성자
	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//메소드
	public void smile() {
		System.out.println("웃다");
	}
	
	public void eat() {
		System.out.println("먹다");
	}
	
}
