package com.kh;

public class PhoneMain2 {

	public static void main(String[] args) {

		LgPhone p = new LgPhone();
		SamsungPhone p2 = new SamsungPhone();
		
		usePhone(p);
		//usePhone(p2);
		
	}
	
	
	public static void usePhone(Phone p) {
		
		p.makeCall();
		
		if(p instanceof LgPhone) {
			LgPhone lg = (LgPhone)p;
			lg.doInternet();
			
		}else if(p instanceof SamsungPhone) {
			SamsungPhone sp = (SamsungPhone)p;
			sp.watchTv();
		}
	}
}
