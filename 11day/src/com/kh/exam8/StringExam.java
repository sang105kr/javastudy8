package com.kh.exam8;

public class StringExam {

	public static void main(String[] args) {

		String name = "È«±æµ¿";
		char ch = name.charAt(0);
		System.out.println(ch);
		for(int i=0; i<name.length(); i++) {
			ch = name.charAt(i);
			System.out.println(ch);
		}
		
		String name2 = new String("È«±æ¼ø");
		char ch2 = name.charAt(0);
		System.out.println(ch2);
		for(int i=0; i<name2.length(); i++) {
			ch2 = name2.charAt(i);
			System.out.println(ch2);
		}
		
		
	}

}
