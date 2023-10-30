package com.springbootaws.Threads;

import java.util.concurrent.TimeUnit;

public class JP13ValueReturningTaskA implements Runnable {

	private int a;
	private int b;
	private long sleepTime;
	private int sum;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;

	private volatile boolean done = false;

	public JP13ValueReturningTaskA(int a, int b, int sleep) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleep;
		this.instanceNumber = ++count;
		this.taskId = "valueReturningTaskA-" + instanceNumber;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String currentThread = Thread.currentThread().getName();
		System.out.println("CurrentThread ---" + currentThread + "--taskID START--" + taskId);

		try {
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sum = a + b;
		System.out.println("CurrentThread ---" + currentThread + "--taskID CALCULATION COMPLETED--" + taskId);

		done = true;

		synchronized (this) {
			System.out.println("[" + Thread.currentThread().getName() + "] NOTIFYING " + taskId + "..");

			this.notify();
		}
	}

	public int get() {
		synchronized (this) {

			if (!done) {
				System.out.println(
						"[" + Thread.currentThread().getName() + "] is Waiting for result from " + taskId + "..");
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return sum;
	}

}
