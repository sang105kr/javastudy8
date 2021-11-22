package com.kh.exam2;

public class Example {

	public static void main(String[] args) {

		ImplementationC imp1 = new ImplementationC();
		imp1.methodA();
		imp1.methodB();
		
		InterfaceC imp2 = new ImplementationC();
		imp2.methodA();
		imp2.methodB();
		
		InterfaceB imp3 = new ImplementationC();
		imp3.methodB();
		
		InterfaceA imp4 = new ImplementationC();
		imp4.methodA();
	}

}
