package com.kh;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(30);
		
		Person p2 = new Person("ȫ���",20);
		p2.setAge(-40);
		int age = p2.getAge();
		System.out.println(age);
		
		Person p3 = new Person("ȫ�泲");
		p3.setAge(40);
		
		System.out.println(Person.nationality);
		
		//Person.nationality = "�̱���";
		
		

	}

}
