package com.kh.exam10;

public class Person {

	int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		if(obj instanceof Person) {
			Person person = (Person)obj;
			
			if(this.age == person.age) {
				result = true;
			}
			
		}
		return result;
	}
}
