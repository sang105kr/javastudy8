package com.kh.exam2;

public class Main {

	public static void main(String[] args) {
		
		//1) �̸��ִ� Ŭ������ ���
		RemoteControll rc = new Tv(); 
		rc.turnOff();
		((Tv)rc).turnOn();
		
		//2) �͸� Ŭ���� ���
		RemoteControll rc2 = new RemoteControll() {
			@Override
			public void turnOff() {
				System.out.println("Tv�� ����");
				turnOn();
			}
			
			//�͸�Ŭ���� ���ο� �߰��� ���ǵ� �ʵ�,�޼ҵ�� �͸�Ŭ���� ���ο����� ��밡��
			void turnOn() {
				System.out.println("Tv�� �Ѵ�");
			}
		};
		rc2.turnOff();
		
	}

}


