package com.kh;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Person person = new Person("ȫ?浿",30);
		person.eat();
		person.smile();
		
		Person person2 = new Person("ȫ????",20);
		person2.eat();
		person2.smile();

	}

}
