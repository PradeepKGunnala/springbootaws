package com.springbootaws.Threads;

import java.util.concurrent.TimeUnit;

//This is used in scenarios of fire and forget - Also called as Ballestic Threads

public class JP04TechniqueRunnableAnonymousFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Started ");
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				for (int i = 0; i < 10; i++) {
					System.out.println("--TICK TICK---" + i);
					try {
						TimeUnit.MICROSECONDS.sleep(500000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		thread.start();
		System.out.println("Main Thread Ended ");
	}
}
