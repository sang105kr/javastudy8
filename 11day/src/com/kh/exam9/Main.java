package com.kh.exam9;
/**
 * �׽�Ʈ
 * @author mypc
 *
 */
public class Main {

	public static void main(String[] args) {
		
		String name = "ȫ�浿";		
//		System.out.println(name.toString());
		String name2 = "ȫ�浿";
		System.out.println(name.equals(name2));
		System.out.println(name == name2);
		
		System.out.println("==");		
		String name3 = new String("ȫ�浿");		
		String name4 = new String("ȫ�浿");
		System.out.println(name3.equals(name4));
		System.out.println(name3 == name4);
		
		System.out.println("==");
		Person person = new Person();
		Person person2 = new Person();		
		System.out.println(person.equals(person2)); //false
	}

}
