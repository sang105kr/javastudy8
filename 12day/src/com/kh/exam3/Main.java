package com.kh.exam3;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(p1.equals(p2));
		
		Person p3 = new Person();
		Person p4 = p3;
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		
	}

}
