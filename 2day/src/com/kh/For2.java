package com.kh;

public class For2 {

	public static void main(String[] args) {
		
		int startDansu = 1;
		int endDansu = 10;
		
		for(int i=startDansu;  i <= endDansu ;   i++) {
			
			if( i % 2 == 0 ) {
				continue; //for�� ������ continue�� ������ ��������� ��� �̵��ȴ�.
			}
			
			System.out.println("=== " + i + "�� ��� ===");
			
			for(int j=1;  j <= 9;   j++) {
			
				System.out.println(i + " * " + j + " = " + i * j);
				
			}
		}
	}
}
