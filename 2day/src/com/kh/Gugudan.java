package com.kh;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		//int dansu = 5;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����ϰ����ϴ� �ܼ��� �Է��ϼ��� : ");
		int dansu = Integer.parseInt(scanner.nextLine());
		
		//System.out.println(dansu);
		
		for(int i=1; i<=9; i++ ) {
			System.out.println( dansu + " * " + i + " = " + dansu * i);
		}

	}

}
