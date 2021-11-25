package com.kh.exam1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();

		//��ü �߰�
		System.out.println(set.add(new Person("ȫ�浿",30)));
		System.out.println(set.add(new Person("ȫ�浿",30)));
		
		System.out.println(set.toString());
		System.out.println(set.size());
		
		set.add(new Person("ȫ�漭",40));
		set.add(new Person("ȫ�泲",50));
		
		System.out.println(set.toString());
		System.out.println(set.size());
		
		//��ü �˻�
		System.out.println(set.contains(new Person("ȫ�泲",50)));
		System.out.println(set.toString());
		System.out.println(set.size());
		
		System.out.println(set.isEmpty());
		
		Iterator<Person> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.printf("�̸�:%s, ����:%d \n",person.getName(), person.getAge());
		};
		
		for(Person person : set) {
			System.out.printf("�̸�:%s, ����:%d \n",person.getName(), person.getAge());
		}
		
		//��ü ����
		set.remove(new Person("ȫ�泲",50));
		System.out.println(set);
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		System.out.println(set.size());
		
		
		
	}

}



