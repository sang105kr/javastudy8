package com.kh;

public class Printf {

	public static void main(String[] args) {

		String name = "ȫ�浿";
		int age = 30;
		int height = 180;
		
//		System.out.printf("�̸�:%1$s, ����:%2$s, Ű:%3$d", "ȫ�浿", "30", 180);
//		System.out.println();
//		
//		System.out.printf("�̸�:%s, ����:%s, Ű:%d", "ȫ�浿", "30", 180);
//		System.out.println();
		
		System.out.println("�̸�:"+name+", ����:"+age+", Ű:"+height );
		System.out.printf("�̸�:%-5s\n, ����:%-5s\n, Ű:%-5d\n", name, age, height);
	}

}
