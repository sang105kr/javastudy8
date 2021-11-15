package com.kh;

public class Calculator {

	private String color = "white";
	private String maker = "korea";
	
	public Calculator() {}
	public Calculator(String color) {
		this.color = color;
	}
	public Calculator(String color , String maker) {
		this.color =color;
		this.maker = maker;
	}
	
	public void on() {
		System.out.println("ÄÑ´Ù");
	}
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public void off() {
		System.out.println("²ô´Ù");
	}
	
}
