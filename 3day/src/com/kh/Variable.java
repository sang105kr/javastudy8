package com.kh;

public class Variable {

	public static void main(String[] args) {
		int x; // ���� ����
		x = 100; // �ʱ�ȭ : ���� ������ ���� ���� �Ҵ��ϴ� ����
		System.out.println(x);
		
		x = 200; // ���Ҵ�
		System.out.println(x);
		
		int y; // ���� ����
		y = x; // x���� ���� �о y������ �ʱ�ȭ
		System.out.println(y);
		
		int z; // ���� ����
		z = x + y;
		System.out.println(z);	
		
		int k; //���� ����
		k = sum(x,y);
		System.out.println(k);
		
		int j;
		j = sum(z,k);
		System.out.println(j);
		
		double m;
		m = sum(1.4, 2.5);
		System.out.println(m);
		
		double n;
		n = sum(1.4+1, 2.5+1);
		System.out.println(n);
	}
	
	//�޼ҵ� ����
	public static int sum(int num1, int num2) {
		
		System.out.println("int sum(int num1, int num2) ȣ���");
		int result = num1 + num2;
		return result;
	}
	
	public static double sum(double num1, double num2) {
	
		System.out.println("double sum(double num1, double num2");

		double result = num1 + num2;
		
		return result;
	}	
}





