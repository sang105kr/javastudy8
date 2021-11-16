package com.kh;

public class Person {
	private int age;
	private Calculator calculator = new Calculator();
	
	public Person() {
	}
	
	public Person(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void smile() {
		System.out.println("¿ô´Ù"+age);
	}
	
	public void setAge(int age) {
		if(age < 0) {
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public Calculator getCalculator() {
		return this.calculator;
	}
}
