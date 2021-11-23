package com.kh.exam6;

public class OverAgeException extends Exception{

	private int age;
	
	public OverAgeException(String msg) {
		super(msg);
	}
	public OverAgeException(String msg, int age) {
		super(msg);
		this.age = age;
	}
	public int getAge() {
		return age;
	}

}
