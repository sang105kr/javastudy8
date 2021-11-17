package com.kh;

public class Car3Main {

	public static void main(String[] args) {
		
		try {
		
		Car3 c1 = new Car3();
		System.out.println(c1);
		System.out.println(c1.getColor());
		System.out.println(c1.getCount2());
		
		//System.out.println(c1.getCount());
		System.out.println(Car3.getCount());
		
		
		Car3 c2 = new Car3();
		System.out.println(c2);
		System.out.println(c2.getColor());
		System.out.println(c2.getCount2());
		
		//System.out.println(c2.getCount());
		System.out.println(Car3.getCount());
		
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
		
		Car3 c3 = new Car3();
		System.out.println(c3);
		System.out.println(c3.getColor());
		System.out.println(c3.getCount2());
		
		//System.out.println(c2.getCount());
		System.out.println(Car3.getCount());
		
		
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
		System.out.println(c3.getCount());
		System.out.println(Car3.getCount());
		
		//°´Ã¼¸¦ ¸¸µç °¹¼ö
		//System.out.println(Car3.getCount());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
