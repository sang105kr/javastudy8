package com.kh;

public class Main {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		int sum = x + y;
		System.out.println(sum);
		
		//���ǹ�
		//1)�ܼ� if(���ǽ�)
		if( x > y) {
			System.out.println("x�� y���� Ů�ϴ�");
		}
		
		//2)if~else~
		if( x < y) {
			System.out.println("y�� x���� Ů�ϴ�.");
		}else {
			System.out.println("x�� y���� Ů�ϴ�.");
		}
		
		//3)if ~ else if ~ else
		if( x > y) {
			System.out.println("x�� y���� Ů�ϴ�.");
		}else if( x < y) {
			System.out.println("x�� y���� �۽��ϴ�.");
		}else {
			System.out.println("x�� y�� �����ϴ�.");
		}

		
		if( true ) {
			System.out.println("�׻� ��µ�!");
		}
		
		if( !true) {
			System.out.println("�׻� ��¾ȵ�!");
		}
		
		if( false ) {
			System.out.println("�׻� ��¾ȵ�!");
		}	
		
		// Math.random() : 0.0 <= X < 1 ������ ������ ������ �߻���Ų��.
		int number = (int)(Math.random()*6)+1;
		System.out.println("number="+number);
		
		switch(number) {
		case 1:
			System.out.println("�ֻ�����:1");
			break;
		case 2:
			System.out.println("�ֻ�����:2");
			break;
		case 3:
			System.out.println("�ֻ�����:3");
			break;
		case 4:
			System.out.println("�ֻ�����:4");
			
		case 5:
			System.out.println("�ֻ�����:5");
			break;
		default:
			System.out.println("�ֻ�����:6");
		}
		
		
	}

}






