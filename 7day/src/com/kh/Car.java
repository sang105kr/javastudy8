package com.kh;

public class Car extends Object{
	
	private static int count;   //Ŭ����(����) ��� �ʵ�
	private int count2;
	private String color;				//��ü(�ν��Ͻ�) ��� �ʵ�
	
	public Car() {
		//super(); //�θ��� �⺻ ������ ȣ��
		count++;
		count2++;
	}
	
	public Car(String color) {
		//super(); //�θ��� �⺻ ������ ȣ��
		this.color = color;
		count++;
		count2++;
	}
	
	public void run() {
		System.out.println("�޸���");
	}
	
	public static int getCount() {
		return count;
	}
	
	public int getCount2() {
		return count2;
	}

}
