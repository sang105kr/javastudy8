package com.kh.abs;

abstract public class Phone {

	private String color;
	
	public Phone(String color) {
		super();
		//Phone ��ü����
		this.color = color;
	}
	public void on() {
		System.out.println("�޴����� �Ѵ�");
	}
	public void sendVoice() {
		System.out.println("�Ҹ��� �����ϴ�");
	}
	
	public String getColor() {
		return this.color;
	}
	
  abstract void off();
}
