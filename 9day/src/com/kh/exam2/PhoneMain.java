package com.kh.exam2;

public class PhoneMain {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Phone phone = new Phone();
		LgPhone lgPhone = new LgPhone();
		SamsungPhone samsungPhone = new SamsungPhone();

		person.makeCall(phone); System.out.println("==");
		person.makeCall(lgPhone);System.out.println("==");
		person.makeCall(samsungPhone);
	}

}
