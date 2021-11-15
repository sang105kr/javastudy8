package com.kh;

public class Printf {

	public static void main(String[] args) {

		String name = "홍길동";
		int age = 30;
		int height = 180;
		
//		System.out.printf("이름:%1$s, 나이:%2$s, 키:%3$d", "홍길동", "30", 180);
//		System.out.println();
//		
//		System.out.printf("이름:%s, 나이:%s, 키:%d", "홍길동", "30", 180);
//		System.out.println();
		
		System.out.println("이름:"+name+", 나이:"+age+", 키:"+height );
		System.out.printf("이름:%-5s\n, 나이:%-5s\n, 키:%-5d\n", name, age, height);
	}

}
