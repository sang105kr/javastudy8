package com.kh;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		Car car2 = new Car("black");
		
		//System.out.println(car2.color);
		car1.run();
		car2.run();

	}

}
