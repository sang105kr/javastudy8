package com.kh.exam8;

public class Main {

	public static void main(String[] args) {
		
		RemoteControll rc = new Tv();
		rc.turnOn();
		rc.turnOff();
		
		RemoteControll rc2 = new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("�Ѵ�2");
			}
			
			@Override
			public void turnOff() {
				System.out.println("����2");
			}
		};
		rc2.turnOn();
		rc2.turnOff();
	}

}
