package com.kh;

public class LgPhone extends Phone {

	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("LG������ ��ȭ��..");
	}
	
	public void doInternet() {
		System.out.println("���ͳ� �ϴ�.");
	}
}
