package com.kh;

public class Person {
	
	public final static String nationality = "�ѱ���"; //����
	private String name;		//�̸�
	private int age;				//����
	
	public Person() {
		//super();  //�θ������ ȣ��
	}
	
	public Person(String name) {
		//super();  1. ������ ������ super(),this()���ÿ� ���Ұ���!
		//this() :
		// 1.���� Ŭ���������� �ٸ� ������ ȣ��,
		// 2.�����ڳ����� �ݵ�� ù�ٿ� ��ġ�ؾ���
		this(name, 10);
//		this.name = name;
//		this.age = 10;
	}
	
	public Person(String name, int age) {
		//super();
		this.name = name;  //this : ������ ��ü�� ��Ī��.
		this.age = age;
	}
	
	//��������
	public void smile() {
		System.out.println("����");
	}
		
	//�Դ�����
	public void eat() {
		System.out.println("�Դ�");
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
