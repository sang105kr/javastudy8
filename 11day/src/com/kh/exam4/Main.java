package com.kh.exam4;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		method1();
		method2();
	}
	
	
	public static void method1() {
		//case1) try~catch절로 예외처리
		try {
			Class c = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void method2() throws ClassNotFoundException {
		//case2) throws : 예외 떠넘기기
		Class c = Class.forName("java.lang.String");
	}

}
