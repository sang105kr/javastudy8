package com.kh.exam1;

public class Television implements RemoteControll {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("ÄÑ´Ù");
	}

	@Override
	public void turnOff() {
		System.out.println("²ô´Ù");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return this.volume;
	}

}
