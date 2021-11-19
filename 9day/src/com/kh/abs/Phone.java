package com.kh.abs;

abstract public class Phone {

	private String color;
	
	public Phone(String color) {
		super();
		//Phone 객체성성
		this.color = color;
	}
	public void on() {
		System.out.println("휴대폰을 켜다");
	}
	public void sendVoice() {
		System.out.println("소리를 전달하다");
	}
	
	public String getColor() {
		return this.color;
	}
	
  abstract void off();
}
