package com.kh.exam8;

public class Tv implements RemoteControll{

	@Override
	public void turnOn() {
		System.out.println("�Ѵ�");
	}

	@Override
	public void turnOff() {
		System.out.println("����");
	}

}
