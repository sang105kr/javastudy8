package com.kh.exam9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List list = new ArrayList();
		
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


	}
}
