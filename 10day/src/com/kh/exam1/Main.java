package com.kh.exam1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// �������̽��� ��üȭ �� �� ����.
		//RemoteControll remoteControll = new RemoteControll();
		
		// ���������δ� ��� ����
		RemoteControll rc;
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(10);
		System.out.println(tv.getVolume());
		
		
		//����Ŭ������ �������̽�Ÿ�Կ� �����Ҽ� �ִ�.
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







