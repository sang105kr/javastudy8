package com.kh;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		//int dansu = 5;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출력하고자하는 단수를 입력하세요 : ");
		int dansu = Integer.parseInt(scanner.nextLine());
		
		//System.out.println(dansu);
		
		for(int i=1; i<=9; i++ ) {
			System.out.println( dansu + " * " + i + " = " + dansu * i);
		}

	}

}
