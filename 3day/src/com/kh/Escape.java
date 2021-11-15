package com.kh;

public class Escape {

	public static void main(String[] args) {
		int x = 10;
		double y = 3.14;
		char ch = 'A';
		boolean stop = true;
		
		String name = "È«±æµ¿";
		
		long z = 10000000000000L;
		float f = 3.143232f;
		
		
		String str1 ="¿ï»ê \"KH\" \nÁ¤º¸\t±³À°\\¿ø";
		System.out.println(str1);
		
		
		double i = 5e100; // 5*10^2
		System.out.println(i);
		
		double j = 5e-2; // 5*10^-2
		System.out.println(j);
		
		int m = +10;

	}

}
