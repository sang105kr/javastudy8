package com.kh.exam6;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("ȫ�浿",30);
		
		try {
			person.setAge(35);
			
		} catch(OverAgeException e) { 
			System.out.println(e.getMessage());
			System.out.println(e.getAge());
			
		}	catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(person.getAge());
		
		try {
			person.setAge(-1);
			
		} catch(OverAgeException e) { 
			System.out.println(e.getMessage());
			System.out.println(e.getAge());
			
		}	catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(person.getAge());
	}

}
