package com.kh;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();

		p1.calculator.on();
		int result = p1.calculator.sum(10, 20);
		System.out.println(result);
		p1.calculator.off();
		
		
		Calculator c1 = new Calculator("black", "japan");
		Person p2 = new Person(c1);
		
		p2.calculator.on();
		System.out.println(p2.calculator.sum(30, 40));
		p2.calculator.off();
		
		
		
	}
}
