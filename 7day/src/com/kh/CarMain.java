package com.kh;

public class CarMain {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1);
		c1.run();
		
		Car c2 = new Car();
		System.out.println(c2);
		c2.run();
		
		Car c3 = new Car("white");
		System.out.println(c3);
		c3.run();
		
		
		System.out.println(Car.getCount());
	}

}
