package com.kh;

public class Car3 {
	
	private String color;
	private int count2;
	private static int count;
	
	
	public Car3() throws Exception {
		//super();
		this.count2++;
		
		
		if(++count == 3) {
			throw new Exception("��ü�����ѵ��ʰ�!");
		};
	}
	
	
	public static int getCount() {
		return count;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getCount2() {
		return count2;
	}

}
