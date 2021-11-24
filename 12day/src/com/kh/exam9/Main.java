package com.kh.exam9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		//°´Ã¼ Ãß°¡
		list.add(new Person("È«±æµ¿",30));		//Ãß°¡
		list.add(new Person("È«±æ¼­",40));		//Ãß°¡
		list.add(new Person("È«±æ³²",50));		//Ãß°¡
		list.add(1,new Person("È«±æ¼ø",20));	//»ðÀÔ
		list.set(3, new Person("È«±æºÏ",10)); //´ëÃ¼
		
		System.out.println(list.toString());
		System.out.println(list.size());
		
		//°´Ã¼ °Ë»ö
		System.out.println(list.contains(new Person("È«±æµ¿",30)));
		
		Person person = (Person)list.get(3);
		System.out.printf("ÀÌ¸§ : %s, ³ªÀÌ : %d\n",person.getName(),person.getAge());
		System.out.println(list.isEmpty());
		System.out.println(list.size());


	}
}
