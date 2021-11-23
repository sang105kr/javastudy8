package com.kh.exam1;

public class Main {

	public static void main(String[] args) {

		//1) 이름있는 클래스사용
		Person person =  new Student();  
		person.eat();
		((Student)person).smile();
		
		Person person3 =  new Student();  
		person3.eat();
		
		
		//2) 익명 클래스사용
		Person person2 = new Person() {
			
			@Override
			public void eat() {
				System.out.println("많이 먹다");
				smile();
			}
			
			public void smile() {
				System.out.println("웃다");
			}
		};
		person2.eat();		
		//person2.smile(); 호출불가.
		
		
		Person person4 = new Person() {
			@Override
			public void eat() {
				System.out.println("많이 먹다");
			}
		};
		person4.eat();
		
		
	}

}



//많이 먹다