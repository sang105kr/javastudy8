package com.kh;

public class For3 {

	public static void main(String[] args) {
		// 1~50������ ���� ���Ͻÿ�		
		int sum = 0;
		for(int i=1; i<=50; i++) {
			sum = sum + i;
		}
		System.out.println("1~50������ �� : " + sum);
		
		// 1~50������ ������ ¦���� ���� ���Ͻÿ�.		
		sum = 0;
		for(int i=1; i<=50; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1~50������ ¦�� �� : " + sum);
		
		// 1~50������ ������ 3�� ����� ���� ����Ͻÿ�.
		System.out.println("1~50������ ������ 3�� ��� ���");
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0) {
				System.out.printf(i + "\t");
			}
		}
		System.out.println();
		
		// 1~50������ ������ 2�� ����̸鼭 3�� ����� ���� ����Ͻÿ�
		System.out.println("1~50������ ������ 2�� ��� �̸鼭 3�� ��� ���");
		for(int i=1; i<=50; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.printf(i + "\t");
			}
		}
	}

}
