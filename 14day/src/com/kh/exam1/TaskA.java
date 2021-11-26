package com.kh.exam1;

public class TaskA implements Runnable {

	@Override
	public void run() {
		for(int i=11; i<=20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
