package com.kh;

public class Promotion {

	public static void main(String[] args) {
		
		byte b = (byte)128;   // -128~127

		System.out.println(b);  // 값의 손실 발생 (overflow)
		
		int x  = 10;
		
		// 강제형변환 : 값의 손실이 없는 경우에 의미가 있다.
		byte y = (byte)x;
		System.out.println(y); // 값을 유지.
		
		
		int i = 1;
		int j = 2;
		
		double result = i / (double)j;
		System.out.println(result);
		
		
		int diceNumber = (int)(Math.random() * 6) + 1;
		System.out.println(diceNumber);
		
		// 문자열을 기본타입으로 변환
		String str1 = "10";
		int result1 = Integer.parseInt(str1);
		byte result2 = Byte.parseByte(str1);
		long result3 = Long.parseLong(str1);
		short result4 = Short.parseShort(str1);
		double result6 = Double.parseDouble(str1);
		
		int z = result1 + result2 + (int)result3 + result4;
		System.out.println(z);
		System.out.println(result6);
		
		byte result5 = (byte)z;
		System.out.println(result5);
		
		//기본타입을 문자열로 변환
		String str2 = String.valueOf(result1);
		String str3 = String.valueOf(result2);
		String str4 = String.valueOf(result3);
		String str5 = String.valueOf(result4);
		
		System.out.println(str2 + "\t" + str3 + "\t" + str4 + "\t" + str5);
		
	}

}
