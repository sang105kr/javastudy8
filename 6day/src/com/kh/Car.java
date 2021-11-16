package com.kh;

public class Car extends Object {

	String color;  //색상
	int cc;				 //배기량
	
	//기본생성자
	//특징 : 1.생성자가 하나도 없으면 자동 생성됨.
	//        생성자가 하나라도 있으면 자동생성 안됨.
	public Car() {
		super(); //부모생성자 호출
		System.out.println("public Car() 호출됨!");
	}
	
	public Car(String color) {
		this(color, 2000);
		//super(); //부모생성자 호출
		this.color = color;
		System.out.println("public Car(String color) 호출됨!");
	}
	
	
	public Car(String color, int cc) {
		super();
		this.color = color;
		this.cc = cc;
		System.out.println("public Car(String color, int cc) 호출됨!");
	}
	
	public void run() {
		//시동을 걸고
		on();
		System.out.println("차가 달린다");
		//시동 끄고
		off();
	}
	
	
	private void on() {
		System.out.println("시동걸고!");
	}
	private void off() {
		System.out.println("시동끄고!");
	}
	
}










