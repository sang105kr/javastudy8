package com.kh.abs;

public class LgPhone extends Phone {
	
	public LgPhone(String color) {
		super(color);
	}
	
	 @Override
	public void sendVoice() {
		 System.out.println("맑은 소리를 전달하다");
	}
	 
	@Override
	void off() {	
		System.out.println("LgPhone을 끕니다.");
	} 
}
