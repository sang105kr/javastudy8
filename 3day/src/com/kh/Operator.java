package com.kh;

public class Operator {

	public static void main(String[] args) {
		
		//1) 증감연산자 단독으로 사용될경우 : 전위 증감연산자, 후위 증감연산자
		int x = 1;
		int y = 1;
		
		x++;  // x = x + 1;
		++y;  // y = y + 1;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		//2) 증감연산자가 수식에 참여할때 
		//   전위 증감 연산자 : 자기자신을 증감한후 식에 참여
		//   후위 증감 연산자 : 식에 참여한후 자기자신을 증감
		
		int i = 1;
		int j = 1;
		
		int m = ++i + 1;
		int n = j++ + 1;
		
		System.out.println("m="+m);
		System.out.println("n="+n);	
		
		System.out.printf("i=%d, j=%d \n", i, j);
		
	}

}
