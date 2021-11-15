package com.kh;

public class ThreeOperator {

	public static void main(String[] args) {
		
		int x  = 3;
		int y  = 3;
		
		if( x > y) {
			System.out.println("x가 크다");
		}else if( x < y){
			System.out.println("y가 크다");
		}else if( x == y) {
			System.out.println("x,y는 같다");
		}
		
		String result = ( x > y ) ? "x가 크다" : 
						( x < y ) ? "y가 크다" : "x,y는 같다";
		System.out.println(result);

	}
}
