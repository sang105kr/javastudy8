package com.kh;

public class SamsungPhone extends Phone {

	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("Samsung폰으로 전화중..");
	}
	public void watchTv() {
		System.out.println("Tv 보다");
	}
}
