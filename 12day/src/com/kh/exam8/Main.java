package com.kh.exam8;

public class Main {

	public static void main(String[] args) {

		int age = 10;

		Integer age2 = 2;  //�ڽ�(Boxing)
		System.out.println(age2.MAX_VALUE);
		System.out.println(age2.MIN_VALUE);
		System.out.println(age2.toString());

		
		Integer age3 = age;
		
		int age10 = age3; //��ڽ�(UnBoxing)
		
		int radius = 5;
		double result = radius * radius * Math.PI;
		System.out.println(result);
		
	}

}
