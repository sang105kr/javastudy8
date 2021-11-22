package com.kh.exam1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// 인터페이스는 객체화 할 수 없다.
		//RemoteControll remoteControll = new RemoteControll();
		
		// 참조변수로는 사용 가능
		RemoteControll rc;
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(10);
		System.out.println(tv.getVolume());
		
		
		//구현클래스는 인터페이스타입에 대입할수 있다.
		rc = tv;
		rc.setVolume(20);
		System.out.println(((Television)rc).getVolume());
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(10);
		System.out.println(audio.getVolume());
		
		rc = audio;
		rc.setVolume(20);
		System.out.println(((Audio)rc).getVolume());
		
		
	}

}







