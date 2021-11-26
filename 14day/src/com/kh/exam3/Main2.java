package com.kh.exam3;
/**
 * 기본타입 : 값 복사
 * @author mypc
 *
 */
public class Main2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;

		System.out.println("b="+b); //10
		chageValue(b);
		System.out.println("b="+b); //10
		
		b = chageValue2(b);
		System.out.println("b="+b); //20		
		
	}

	private static void chageValue(int b) {
		b = 20;
	}
	private static int chageValue2(int b) {
		b = 20;
		return b;
	}

}
