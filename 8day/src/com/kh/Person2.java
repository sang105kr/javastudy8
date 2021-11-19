package com.kh;

public class Person2 {

	private static final String nationality = "한국인";
	private int age;
	
	private static String city = "울산";
	
//	public Person2() {
//		super();
//	}
	
	public static String getNationality() {
		return nationality;
	}
	
	//클래스(정적)메소드 내에서 객체(인스턴스) 멤버필드는 사용할수 없다.
//	public static int getAge() {		
//		return age;
//	}
	public int getAge2() {		
		return age;
	}
	
	//객체(인스턴스) 멤버필드는 클래스(정적)메소드 내에서 사용할 수 있다.
	public String getCity() {
		return city;
	}
	public static String getCity2() {
		return city;
	}
}
