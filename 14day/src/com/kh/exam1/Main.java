package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
		Runnable taskA = new TaskA();
		Thread threadA = new Thread(taskA);
		threadA.start();
		
		Runnable taskB = new TaskB();
		Thread threadB = new Thread(taskB);
		threadB.start();
		
		
		Thread threadC = new Thread(new Runnable() {			
			@Override
			public void run() {
				for(int i=31; i<=40; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		threadC.start();
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				for(int i=41; i<=50; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		//람다표현식, 함수형프로그래밍
		new Thread(()->{
			for(int i=51; i<=60; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		}).start();
		
		
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
