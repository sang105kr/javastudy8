package com.kh;

public class Calculator {
	
	private String maker;
	private String color;
	
	public Calculator() {}
	public Calculator(String maker,String color) {
		this.maker = maker;
		this.color = color;
	}
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

}
