package com.kh;
/*
 * 1~10���� �հ� ���ϱ�
 */
public class DoWhile {

	public static void main(String[] args) {
		
		// for��
		int sum = 0;
		for(int i=1; i<=10; i++) { // i=i+1;
			sum += i; //sum = sum + i;
		}
		System.out.println("sum=" + sum);
		
		// while��
		int sum2 = 0;
		int j = 1;
		while(j<=10) {
			sum2 += j;
			j++;
		}
		System.out.println("sum2=" + sum2);
		
		// do while��
		int sum3 = 0;
		int k = 1;
		do {
			sum3 += k;
			k++;
		}while( k <= 10);
		System.out.println("sum3=" + sum3);
		
	}
}
