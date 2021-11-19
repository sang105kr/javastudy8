package com.kh.abs;

public class Main {

	public static void main(String[] args) {
//		추상클래스는 객체화(실체화)할 수 없다.
//		추상클래스는 개념(타입)으로만 사용가능하다.		
//		Phone p = new Phone();
		Phone phone = new LgPhone("black");
		phone.on();
		phone.sendVoice();
		System.out.println(phone.getColor());
	}
}
