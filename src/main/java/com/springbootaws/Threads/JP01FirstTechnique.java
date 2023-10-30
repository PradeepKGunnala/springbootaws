package com.springbootaws.Threads;

import java.util.concurrent.TimeUnit;

public class JP01FirstTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Started ");
		new FirstTask();
		new FirstTask();
		System.out.println("Main Thread Ended ");
	}
}

class FirstTask extends Thread {

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

	public FirstTask() {
		this.id = ++count;
		this.start();
	}
}
