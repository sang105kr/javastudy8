package com.kh;

public class Car2 {
	int maxSpeed; 			//��ü(�ν��Ͻ�)��� �ʵ�
	int count;		      //Ŭ����(����)��� �ʵ�
	static int count2;
	
	public Car2() {
		count++;
		count2++;
	}
	
	
	int getMaxSpeed() {	//��ü(�ν��Ͻ�)��� �޼ҵ�
		return maxSpeed;
	}
	
	int getCount() {
		return count;
	}
	
	int getCount2() {
		return count2;
	}
}
