package com.kh;
/*
 * 문자열 비교는 == (x)
 * equals()메소드 사용할것!!
 */
public class Equal {

	public static void main(String[] args) {
		String name = "홍길동";		
		String name2 = "홍길동";
		
		if(name == name2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(name.equals(name2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		if(name3 == name4) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(name3.equals(name4)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}		
	}
}
