package com.kh.exam1;

public class Television implements RemoteControll {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("�Ѵ�");
	}

	@Override
	public void turnOff() {
		System.out.println("����");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return this.volume;
	}

}
