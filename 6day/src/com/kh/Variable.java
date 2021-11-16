package com.kh;

public class Variable {

	public static void main(String[] args) {
	
		System.out.println(sum(new int[]{1}));
		System.out.println(sum(new int[]{1,2}));
		
		
		int[] values = {1,2,3};
		System.out.println(sum(values));
		
		
		int[] values2 = null;
		values2 = new int[] {1,2,3,4};
		System.out.println(sum(values2));
		
		
		System.out.println(sum(new int[]{1,2,3,4,5,6}));

	}
	//�������� : �Ű����� ������ �������ִ� �������(1���̻�)
//	public static int sum(int ...numbers) { 
//		System.out.println("public static int sum(int ... numbers) ȣ���");
//		int sum = 0;
//		for(int i=0; i<numbers.length; i++) {
//			sum += numbers[i];		
//		}		
//		return sum;
//	}
	
//	public static int sum(int num1, int num2) {
//		System.out.println("public static int sum(int num1, int num2) ȣ���!");
//		return num1 + num2;
//	}
	
	public static int sum(int[] numbers) {
		int sum = 0;
//		for(int i=0; i<numbers.length; i++) {
//			sum += numbers[i];		
//		}		
		for(int number : numbers) {
			sum += number;		
		}		
		return sum;
	}

}





