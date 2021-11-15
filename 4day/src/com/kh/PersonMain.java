package com.kh;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Person person = new Person("È«±æµ¿",30);
		person.eat();
		person.smile();
		
		Person person2 = new Person("È«±æ¼ø",20);
		person2.eat();
		person2.smile();

	}

}
