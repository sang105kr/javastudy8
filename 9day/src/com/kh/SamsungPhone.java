package com.kh;

public class SamsungPhone extends Phone {

	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("Samsung������ ��ȭ��..");
	}
	public void watchTv() {
		System.out.println("Tv ����");
	}
}
