package com.kh;

public class Person2 {

	private static final String nationality = "�ѱ���";
	private int age;
	
	private static String city = "���";
	
//	public Person2() {
//		super();
//	}
	
	public static String getNationality() {
		return nationality;
	}
	
	//Ŭ����(����)�޼ҵ� ������ ��ü(�ν��Ͻ�) ����ʵ�� ����Ҽ� ����.
//	public static int getAge() {		
//		return age;
//	}
	public int getAge2() {		
		return age;
	}
	
	//��ü(�ν��Ͻ�) ����ʵ�� Ŭ����(����)�޼ҵ� ������ ����� �� �ִ�.
	public String getCity() {
		return city;
	}
	public static String getCity2() {
		return city;
	}
}
