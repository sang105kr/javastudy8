package com.kh.exam7;

public class Main {

	public static void main(String[] args) {

		String name =  "ȫ�浿";
		String name2 = "ȫ�浿";

		String name3 = name2.replace("��", "��");
		
		
		System.out.println(name == name2);
		System.out.println(name2 == name3);
	}

}
