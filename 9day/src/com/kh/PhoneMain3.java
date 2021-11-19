package com.kh;

public class PhoneMain3 {

	public static void main(String[] args) {
			
//			Phone p1 = new LgPhone();
//			Phone p2 = new SamsungPhone();
			
			usePhone(new LgPhone());
			usePhone(new SamsungPhone());
	}
	
	public static void usePhone(Phone p) {
		p.makeCall();
	}

}
