package com.kh.exam2;

public class Tv implements RemoteControll{
	@Override
	public void turnOff() {
		System.out.println("Tv�� ����");
	}
	
	public void turnOn() {
		System.out.println("Tv�� �Ѵ�");
	}
}
