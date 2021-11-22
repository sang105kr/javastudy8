package com.kh.exam9;

public class Main {

	public static void main(String[] args) {
		
		Person person =	new Person() {
							
				public void study() {
					System.out.println("공부하다");
				}
				
				@Override
				public void eat() {
					System.out.println("많이 먹다");
					study();
				}
			};
		
		person.eat();

	}

}
