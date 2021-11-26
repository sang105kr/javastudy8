package com.kh.exam2;

public class ThreadA extends Thread {

	public ThreadA() {
		super();
	}
	public ThreadA(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(getName() + ":" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
