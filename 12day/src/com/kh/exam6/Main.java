package com.kh.exam6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("울산*KH".substring(3));
		
		String str = "울산---------------------*KH";
		int findedPosition = str.indexOf("*")+1;
		//System.out.println(str.substring((str.indexOf("*")+1)));
		System.out.println(str.substring(findedPosition));

		boolean stop = false;
		
		while(!stop) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("이름을 입력하세요 : ");
			String name = scanner.nextLine();
			System.out.println(name);
			
			if(existNumber(name)) {
				System.out.println("숫자가 포함되었습니다. 다시 입력바랍니다.");
				continue;
			}else{
				stop = true;
				continue;
			}
		}
		
	}

	private static boolean existNumber(String name) {
		boolean result = false;
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(ch >= 48 && ch <= 58 ) {  // 0~9 포함되어있는지 판단
				result = true;
				break;
			}		
		}
		return result;
	}
}
