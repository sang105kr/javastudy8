package com.kh.exam9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		
		//��ü �߰�
		list.add(new Person("ȫ�浿",30));		//�߰�
		list.add(new Person("ȫ�漭",40));		//�߰�
		list.add(new Person("ȫ�泲",50));		//�߰�
		list.add(1,new Person("ȫ���",20));	//����
		list.set(3, new Person("ȫ���",10)); //��ü
		
		System.out.println(list.toString());
		System.out.println(list.size());
		
		//��ü �˻�
		System.out.println(list.contains(new Person("ȫ�浿",30)));
		
		Person person = (Person)list.get(3);
		System.out.printf("�̸� : %s, ���� : %d\n",person.getName(),person.getAge());
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		//��ü ����
		Person removedPerson = list.remove(1);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		System.out.println(list.remove(new Person("ȫ�浿",30)));
		System.out.println(list.toString());
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list.toString());
		System.out.println(list.size());

	}
}
