package com.kh;

public class Car extends Object {

	String color;  //����
	int cc;				 //��ⷮ
	
	//�⺻������
	//Ư¡ : 1.�����ڰ� �ϳ��� ������ �ڵ� ������.
	//        �����ڰ� �ϳ��� ������ �ڵ����� �ȵ�.
	public Car() {
		super(); //�θ������ ȣ��
		System.out.println("public Car() ȣ���!");
	}
	
	public Car(String color) {
		this(color, 2000);
		//super(); //�θ������ ȣ��
		this.color = color;
		System.out.println("public Car(String color) ȣ���!");
	}
	
	
	public Car(String color, int cc) {
		super();
		this.color = color;
		this.cc = cc;
		System.out.println("public Car(String color, int cc) ȣ���!");
	}
	
	public void run() {
		//�õ��� �ɰ�
		on();
		System.out.println("���� �޸���");
		//�õ� ����
		off();
	}
	
	
	private void on() {
		System.out.println("�õ��ɰ�!");
	}
	private void off() {
		System.out.println("�õ�����!");
	}
	
}










