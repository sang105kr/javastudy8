package com.kh;

public class FinalTest {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
		num = 20;
		System.out.println(num);
		
		final int NUM = 30;
		System.out.println(NUM);
		
		// final로 선언된 변수는 처음 한번 초기화되면 재할당이 안된다.
		//NUM = 40;
		
		int round = 5;
		final double PI = 3.14;
		
		System.out.println(round * round * PI);
	}
}
