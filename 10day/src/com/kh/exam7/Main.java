package com.kh.exam7;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.study();
		
		
		new Person() {
			
			void study() {
				System.out.println("�����ϴ�2");
			}
		}.study();
		
		
		Person person = new Student();
		person.eat();
		
		
		Person person2 = new Person() {
			
			public void study() {
				System.out.println("�����ϴ�");
			}
			
			@Override
			public void eat() {
				System.out.println("���� �Դ�2");
			}
		};
		person2.eat();

	}

}
