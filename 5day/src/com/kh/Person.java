package com.kh;

// Ŭ����
public class Person {

	//��� �ʵ�
	private String name;
	private int age;	
	private Gender gender;
	Calculator calculator = new Calculator();
	
	//����Ʈ ������
	public Person() {}
	
	public Person(Calculator calculator) {
		this.calculator = calculator;
	}
	
	//������
	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//�޼ҵ�
	public void smile() {
		System.out.println("����");
	}
	
	public void eat() {
		System.out.println("�Դ�");
	}
	
}