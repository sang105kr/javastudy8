package com.kh.exam6;

public class Main {

	public static void main(String[] args) {
		InterfaceA interFaceA;
		
		
		Child p1 = new Child();
		Parent p2 = new Child();
		InterfaceA p3 = new Child();
		
		
		method(p1);
		method(p2);
		method(p3);

	}
	
	public static void method(InterfaceA inter) {
		
		if(inter instanceof Child) {
			Child child = (Child)inter;

		}else if(inter instanceof Parent) {
			Parent parent = (Parent)inter;
			
		}else if(inter instanceof InterfaceA) {
			InterfaceA interfaceA = (InterfaceA)inter;
		}
		
	}

}
