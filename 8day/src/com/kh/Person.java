package com.kh;

public class Person {
	
	public final static String nationality = "한국인"; //국적
	private String name;		//이름
	private int age;				//나이
	
	public Person() {
		//super();  //부모생성자 호출
	}
	
	public Person(String name) {
		//super();  1. 생성자 내에서 super(),this()동시에 사용불가능!
		//this() :
		// 1.동일 클래스내에서 다른 생성자 호출,
		// 2.생성자내에서 반드시 첫줄에 위치해야함
		this(name, 10);
//		this.name = name;
//		this.age = 10;
	}
	
	public Person(String name, int age) {
		//super();
		this.name = name;  //this : 생성될 객체를 지칭함.
		this.age = age;
	}
	
	//웃는행위
	public void smile() {
		System.out.println("웃다");
	}
		
	//먹는행위
	public void eat() {
		System.out.println("먹다");
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
