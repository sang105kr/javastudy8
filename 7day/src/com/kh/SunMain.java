package com.kh;

import java.util.Calendar;

public class SunMain {

	public static void main(String[] args) {
	
		Sun sun = Sun.getIntance();
		System.out.println(sun);
		
		Sun sun2 = Sun.getIntance();
		System.out.println(sun);
		
		if(sun == sun2) {
			System.out.println("동일한객체");
		}else {
			System.out.println("다른객체");
		}
		
		//표준라이브러리 중에 싱글턴 패턴이 적용된 예.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toInstant());
		
		
		Math.random();
	}

}
