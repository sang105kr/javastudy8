package com.kh.exam1;

public class TaskB implements Runnable {

	@Override
	public void run() {
		for(int i=21; i<=30; i++) {
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
