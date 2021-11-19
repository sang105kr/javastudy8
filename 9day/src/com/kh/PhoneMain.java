package com.kh;

public class PhoneMain {

	public static void main(String[] args) {
		
		LgPhone lgPhone = new LgPhone();
		lgPhone.makeCall();
		lgPhone.doInternet();
		
		SamsungPhone sp = new SamsungPhone();
		sp.hangUp();
		sp.watchTv();
		
		
		Phone phone = lgPhone;
		phone.makeCall();
		
		LgPhone lgPhone2 = (LgPhone)phone;
		lgPhone2.doInternet();
		
		
		Phone phone2 = sp;
		phone2.makeCall();
		

	}

}
