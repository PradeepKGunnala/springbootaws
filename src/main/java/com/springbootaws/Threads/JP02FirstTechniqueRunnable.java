package com.springbootaws.Threads;

import java.util.concurrent.TimeUnit;

//This is used in scenarios of fire and forget - Also called as Ballestic Threads

public class JP02FirstTechniqueRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Started ");
		new Thread(new ThirdTask()).start();
		Thread t = new Thread(new ThirdTask());
		t.start();
		System.out.println("Main Thread Ended ");
	}
}

class ThirdTask implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(+id + "--TICK TICK---" + i);

			try {
				TimeUnit.MICROSECONDS.sleep(500000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ThirdTask() {
		this.id = ++count;
		// new Thread(this).start();
	}
}
