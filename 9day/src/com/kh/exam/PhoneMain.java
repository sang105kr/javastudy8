package com.kh.exam;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.makeCall();
		
		//LgPhone lgPhone = (LgPhone)p1;
		//lgPhone.doInternet();
		
		
		Phone p2 = new LgPhone();
		p2.makeCall();
		
		LgPhone lgPhone2 = (LgPhone)p2;
		lgPhone2.doInternet();

	}

}
