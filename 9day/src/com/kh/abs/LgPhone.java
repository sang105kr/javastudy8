package com.kh.abs;

public class LgPhone extends Phone {
	
	public LgPhone(String color) {
		super(color);
	}
	
	 @Override
	public void sendVoice() {
		 System.out.println("���� �Ҹ��� �����ϴ�");
	}
	 
	@Override
	void off() {	
		System.out.println("LgPhone�� ���ϴ�.");
	} 
}
