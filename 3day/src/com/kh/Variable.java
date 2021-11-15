package com.kh;

public class Variable {

	public static void main(String[] args) {
		int x; // 변수 선언
		x = 100; // 초기화 : 변수 선언후 최초 값을 할당하는 행위
		System.out.println(x);
		
		x = 200; // 재할당
		System.out.println(x);
		
		int y; // 변수 선언
		y = x; // x변수 값을 읽어서 y변수에 초기화
		System.out.println(y);
		
		int z; // 변수 선언
		z = x + y;
		System.out.println(z);	
		
		int k; //변수 선언
		k = sum(x,y);
		System.out.println(k);
		
		int j;
		j = sum(z,k);
		System.out.println(j);
		
		double m;
		m = sum(1.4, 2.5);
		System.out.println(m);
		
		double n;
		n = sum(1.4+1, 2.5+1);
		System.out.println(n);
	}
	
	//메소드 정의
	public static int sum(int num1, int num2) {
		
		System.out.println("int sum(int num1, int num2) 호출됨");
		int result = num1 + num2;
		return result;
	}
	
	public static double sum(double num1, double num2) {
	
		System.out.println("double sum(double num1, double num2");

		double result = num1 + num2;
		
		return result;
	}	
}





