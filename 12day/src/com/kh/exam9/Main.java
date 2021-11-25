package com.kh.exam9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		
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
		
		//°´Ã¼ »èÁ¦
		Person removedPerson = list.remove(1);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		System.out.println(list.remove(new Person("È«±æµ¿",30)));
		System.out.println(list.toString());
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list.toString());
		System.out.println(list.size());

	}
}
