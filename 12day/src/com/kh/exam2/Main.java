package com.kh.exam2;

public class Main {

	public static void main(String[] args) {
		
		String name = new String("ȫ�浿");		
		System.out.println(name);
		System.out.println(name.toString());
		System.out.println(name.hashCode());
		
		System.out.println("----");
		
		Person person = new Person("ȫ�浿");
		System.out.println(person);
		System.out.println(person.toString());
		System.out.println(person.hashCode());

	}

}
