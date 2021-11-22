package com.kh.exam7;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.study();
		
		
		new Person() {
			
			void study() {
				System.out.println("공부하다2");
			}
		}.study();
		
		
		Person person = new Student();
		person.eat();
		
		
		Person person2 = new Person() {
			
			public void study() {
				System.out.println("공부하다");
			}
			
			@Override
			public void eat() {
				System.out.println("많이 먹다2");
			}
		};
		person2.eat();

	}

}
