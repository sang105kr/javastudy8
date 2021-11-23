package com.kh.exam3;

import java.lang.*;

public class ExceptionExample extends Object {

	public ExceptionExample() {}
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		//try {
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			
		//}catch(ArrayIndexOutOfBoundsException ex) {
		//	System.out.println(ex.getMessage());
	//	}
		System.out.println("프로그램종료!");
	}
}
