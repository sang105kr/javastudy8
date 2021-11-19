package com.kh.exam2;

public class Person {

	public void makeCall(Phone phone) {
		System.out.println("전화하다");
		phone.sendVoice("안녕하세요 ");
	}
}
