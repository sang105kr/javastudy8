package com.kh.exam6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("���*KH".substring(3));
		
		String str = "���---------------------*KH";
		int findedPosition = str.indexOf("*")+1;
		//System.out.println(str.substring((str.indexOf("*")+1)));
		System.out.println(str.substring(findedPosition));

		boolean stop = false;
		
		while(!stop) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = scanner.nextLine();
			System.out.println(name);
			
			if(existNumber(name)) {
				System.out.println("���ڰ� ���ԵǾ����ϴ�. �ٽ� �Է¹ٶ��ϴ�.");
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
			
			if(ch >= 48 && ch <= 58 ) {  // 0~9 ���ԵǾ��ִ��� �Ǵ�
				result = true;
				break;
			}		
		}
		return result;
	}
}
