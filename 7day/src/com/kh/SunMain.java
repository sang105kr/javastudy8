package com.kh;

import java.util.Calendar;

public class SunMain {

	public static void main(String[] args) {
	
		Sun sun = Sun.getIntance();
		System.out.println(sun);
		
		Sun sun2 = Sun.getIntance();
		System.out.println(sun);
		
		if(sun == sun2) {
			System.out.println("�����Ѱ�ü");
		}else {
			System.out.println("�ٸ���ü");
		}
		
		//ǥ�ض��̺귯�� �߿� �̱��� ������ ����� ��.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toInstant());
		
		
		Math.random();
	}

}
