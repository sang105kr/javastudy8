package com.kh.exam9;

public class Main {

	public static void main(String[] args) {
		
		Person person =	new Person() {
							
				public void study() {
					System.out.println("�����ϴ�");
				}
				
				@Override
				public void eat() {
					System.out.println("���� �Դ�");
					study();
				}
			};
		
		person.eat();

	}

}
