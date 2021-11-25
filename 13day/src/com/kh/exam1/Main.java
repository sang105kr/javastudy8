package com.kh.exam1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();

		//°´Ã¼ Ãß°¡
		System.out.println(set.add(new Person("È«±æµ¿",30)));
		System.out.println(set.add(new Person("È«±æµ¿",30)));
		
		System.out.println(set.toString());
		System.out.println(set.size());
		
		set.add(new Person("È«±æ¼­",40));
		set.add(new Person("È«±æ³²",50));
		
		System.out.println(set.toString());
		System.out.println(set.size());
		
		//°´Ã¼ °Ë»ö
		System.out.println(set.contains(new Person("È«±æ³²",50)));
		System.out.println(set.toString());
		System.out.println(set.size());
		
		System.out.println(set.isEmpty());
		
		Iterator<Person> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.printf("ÀÌ¸§:%s, ³ªÀÌ:%d \n",person.getName(), person.getAge());
		};
		
		for(Person person : set) {
			System.out.printf("ÀÌ¸§:%s, ³ªÀÌ:%d \n",person.getName(), person.getAge());
		}
		
		//°´Ã¼ »èÁ¦
		set.remove(new Person("È«±æ³²",50));
		System.out.println(set);
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		System.out.println(set.size());
		
		
		
	}

}



