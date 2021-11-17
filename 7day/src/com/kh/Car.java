package com.kh;

public class Car extends Object{
	
	private static int count;   //클래스(정적) 멤버 필드
	private int count2;
	private String color;				//객체(인스턴스) 멤버 필드
	
	public Car() {
		//super(); //부모의 기본 생성자 호출
		count++;
		count2++;
	}
	
	public Car(String color) {
		//super(); //부모의 기본 생성자 호출
		this.color = color;
		count++;
		count2++;
	}
	
	public void run() {
		System.out.println("달리다");
	}
	
	public static int getCount() {
		return count;
	}
	
	public int getCount2() {
		return count2;
	}

}
