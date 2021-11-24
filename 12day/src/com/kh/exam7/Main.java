package com.kh.exam7;

public class Main {

	public static void main(String[] args) {

		String name =  "È«±æµ¿";
		String name2 = "È«±æµ¿";

		String name3 = name2.replace("µ¿", "¼ø");
		
		
		System.out.println(name == name2);
		System.out.println(name2 == name3);
	}

}
