package com.kh;

public class Operator {

	public static void main(String[] args) {
		
		//1) ���������� �ܵ����� ���ɰ�� : ���� ����������, ���� ����������
		int x = 1;
		int y = 1;
		
		x++;  // x = x + 1;
		++y;  // y = y + 1;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		//2) ���������ڰ� ���Ŀ� �����Ҷ� 
		//   ���� ���� ������ : �ڱ��ڽ��� �������� �Ŀ� ����
		//   ���� ���� ������ : �Ŀ� �������� �ڱ��ڽ��� ����
		
		int i = 1;
		int j = 1;
		
		int m = ++i + 1;
		int n = j++ + 1;
		
		System.out.println("m="+m);
		System.out.println("n="+n);	
		
		System.out.printf("i=%d, j=%d \n", i, j);
		
	}

}
