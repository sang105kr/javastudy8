package com.kh;

import java.util.Scanner;

public class Main {
	String name;
	
	public static void main(String[] args) {
		
		Person p1 = new Person();		
//		Calculator calculator = p1.getCalculator();
//		int result10 = calculator.sum(10, 20);
		int result = p1.getCalculator().sum(10, 20);
		
		
		System.out.println(result);

		Calculator c1 = new Calculator("korea", "white");
		Person p2 = new Person(c1);
		int result2 = p2.getCalculator().sum(20, 30);
		System.out.println(result2);
		
		Person p3 = new Person();
		p3.setCalculator(c1);
		int result3 = p3.getCalculator().sum(30, 30);
		System.out.println(result3);
		
	}
}
