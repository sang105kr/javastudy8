package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
	
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		System.out.println(p1 == p2);				//동일성 체크
		System.out.println(p1.equals(p2));  //동등성 체크
		
		int a = 10;
		int b = a;				//값이 복사(pass by value)
		b = 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		//참조타입에서는 2개이상의 참조변수가 동일한 객체를 참조할경우 주의하자!
		Person p3 = new Person(10);
		Person p4 = p3;   //주소값이 복사(pass by reference)
		p4.setAge(20);
		System.out.println("p3.age=" + p3.getAge());
		System.out.println("p4.age=" + p4.getAge());
		
		
		//참조타입에서는 2개이상의 참조변수가 동일타입 객체에 영향을 안주려면 별도의 객체를 생성하자
		Person p5 = new Person(10);
		Person p6 = new Person(10);   
		p6.setAge(20);
		System.out.println("p3.age=" + p5.getAge());
		System.out.println("p4.age=" + p6.getAge());
		
		
		String name = "홍길동";
		String name2 = "홍길동";		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");		
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));
			
	}
}
