package com.kh.abs;

public class Main {

	public static void main(String[] args) {
//		�߻�Ŭ������ ��üȭ(��üȭ)�� �� ����.
//		�߻�Ŭ������ ����(Ÿ��)���θ� ��밡���ϴ�.		
//		Phone p = new Phone();
		Phone phone = new LgPhone("black");
		phone.on();
		phone.sendVoice();
		System.out.println(phone.getColor());
	}
}
