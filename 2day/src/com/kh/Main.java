package com.kh;

public class Main {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		int sum = x + y;
		System.out.println(sum);
		
		//조건문
		//1)단순 if(조건식)
		if( x > y) {
			System.out.println("x는 y보다 큽니다");
		}
		
		//2)if~else~
		if( x < y) {
			System.out.println("y는 x보다 큽니다.");
		}else {
			System.out.println("x는 y보다 큽니다.");
		}
		
		//3)if ~ else if ~ else
		if( x > y) {
			System.out.println("x는 y보다 큽니다.");
		}else if( x < y) {
			System.out.println("x는 y보다 작습니다.");
		}else {
			System.out.println("x와 y는 같습니다.");
		}

		
		if( true ) {
			System.out.println("항상 출력됨!");
		}
		
		if( !true) {
			System.out.println("항상 출력안됨!");
		}
		
		if( false ) {
			System.out.println("항상 출력안됨!");
		}	
		
		// Math.random() : 0.0 <= X < 1 사이의 임의의 난수를 발생시킨다.
		int number = (int)(Math.random()*6)+1;
		System.out.println("number="+number);
		
		switch(number) {
		case 1:
			System.out.println("주사위값:1");
			break;
		case 2:
			System.out.println("주사위값:2");
			break;
		case 3:
			System.out.println("주사위값:3");
			break;
		case 4:
			System.out.println("주사위값:4");
			
		case 5:
			System.out.println("주사위값:5");
			break;
		default:
			System.out.println("주사위값:6");
		}
		
		
	}

}






