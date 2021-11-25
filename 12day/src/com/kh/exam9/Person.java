package com.kh.exam9;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)  //동일객체면 true
			return true;
		if (obj == null)  //null 비교는 false
			return false;
		if (getClass() != obj.getClass()) //타입이 다르면 false
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}
