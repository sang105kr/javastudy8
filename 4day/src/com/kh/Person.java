package com.kh;

public class Person {
	//¸â¹öÇÊµå
	String name;
	int age;
	
	//»ý¼ºÀÚ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//¸Þ¼Òµå
	public void smile() {
		System.out.println( name + ": ¿ô´Ù ");
	}
	
	public void eat() {
		System.out.println(name + ": ¸Ô´Ù");
	}
}
