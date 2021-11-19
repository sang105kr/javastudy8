package com.kh;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("È«±æµ¿");
		p1.setAge(30);
		
		Person p2 = new Person("È«±æ¼ø",20);
		p2.setAge(-40);
		int age = p2.getAge();
		System.out.println(age);
		
		Person p3 = new Person("È«±æ³²");
		p3.setAge(40);
		
		System.out.println(Person.nationality);
		
		//Person.nationality = "¹Ì±¹ÀÎ";
		
		

	}

}
