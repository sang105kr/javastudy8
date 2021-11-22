package com.kh.exam7;

public class Student extends Person {

	public void study() {
		System.out.println("공부하다");
	}
	
	@Override
	public void eat() {
		System.out.println("많이 먹다");
	}
}
