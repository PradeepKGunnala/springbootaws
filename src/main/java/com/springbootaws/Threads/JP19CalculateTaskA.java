package com.springbootaws.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class JP19CalculateTaskA implements Callable<Integer> {

	private int a;
	private int b;
	private long sleepTime;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;

	public JP19CalculateTaskA(int a, int b, int sleep) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleep;
		this.instanceNumber = ++count;
		this.taskId = "JP19CalculateTaskA-" + instanceNumber;

	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		String currentThread = Thread.currentThread().getName();
		System.out.println("CurrentThread ---" + currentThread + "--taskID START--" + taskId);

		TimeUnit.MILLISECONDS.sleep(sleepTime);

		System.out.println("CurrentThread ---" + currentThread + "--taskID CALCULATION COMPLETED--" + taskId);
		return a + b;
	}
}
