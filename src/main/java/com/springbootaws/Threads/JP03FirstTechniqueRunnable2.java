package com.springbootaws.Threads;

import java.util.concurrent.TimeUnit;

//This is used in scenarios of fire and forget - Also called as Ballestic Threads

public class JP03FirstTechniqueRunnable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Started ");
		new SecondTask();
		new SecondTask();
		System.out.println("Main Thread Ended ");
	}
}

class SecondTask implements Runnable {

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

	public SecondTask() {
		this.id = ++count;
		new Thread(this).start();
	}
}
