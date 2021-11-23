package com.kh.exam2;

public class Main {

	public static void main(String[] args) {
		
		//1) 이름있는 클래스를 사용
		RemoteControll rc = new Tv(); 
		rc.turnOff();
		((Tv)rc).turnOn();
		
		//2) 익명 클래스 사용
		RemoteControll rc2 = new RemoteControll() {
			@Override
			public void turnOff() {
				System.out.println("Tv를 끄다");
				turnOn();
			}
			
			//익명클래스 내부에 추가로 정의된 필드,메소드는 익명클래스 내부에서만 사용가능
			void turnOn() {
				System.out.println("Tv를 켜다");
			}
		};
		rc2.turnOff();
		
	}

}


