package com.kh.exam3;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("È«±æµ¿",30);
		
		System.out.println("age of p1 : " + p1.getAge());
		chageAge(p1);
		System.out.println("age of p1 : " + p1.getAge());
		
		System.out.println("name of p1 : " + p1.getName());
		String name = changeName(p1);
		System.out.println("name of p1 : " + p1.getName());
	}

	private static String changeName(Person p1) {
		p1.setName("È«±æ¼ø");
		return p1.getName();
	}

	private static void chageAge(Person p1) {		
		p1.setAge(40);
	}

}
