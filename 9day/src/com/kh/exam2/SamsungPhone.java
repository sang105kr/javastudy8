package com.kh.exam2;

public class SamsungPhone extends Phone {
	@Override
	public void sendVoice(String msg) {
		//super.sendVoice(msg);
		System.out.println(msg + "SamsungPhone���� �����ϴ�.");
	}
}
