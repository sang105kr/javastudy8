package com.kh.exam1;

public interface RemoteControll {

	//public static final 생략되더라도 자동을 컴파일러가 생성해준다.
	//public static final String maker = "삼성";
	String maker = "삼성";
	
	//public abstract가 생략되더라도 자동으로 컴파일러가 생성해준다.
	//public abstract void turnOn();
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volume);
}
