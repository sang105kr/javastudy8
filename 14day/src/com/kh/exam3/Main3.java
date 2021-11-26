package com.kh.exam3;
/**
 * 참조타입 : 주소값 복사
 * @author mypc
 *
 */
public class Main3 {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동",10);
		Person p2 = p1;
		
		System.out.println(p2.getAge());
		chageAge(p2);
		System.out.println(p2.getAge());

	}

	private static void chageAge(Person p2) {
		p2.setAge(20);
	}

}
