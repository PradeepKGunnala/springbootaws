package com.springbootaws.Threads;

import java.util.concurrent.TimeUnit;

public class JP17ValueReturningTaskB implements Runnable {

	private int a;
	private int b;
	private long sleepTime;
	private int sum;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;

	private JP15ResultListener<Integer> resultProcessor;

	public JP17ValueReturningTaskB(int a, int b, int sleep, JP15ResultListener<Integer> resultProcessor) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleep;
		this.instanceNumber = ++count;
		this.taskId = "valueReturningTaskB-" + instanceNumber;
		this.resultProcessor = resultProcessor;

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

		resultProcessor.notifyResult(sum);

	}

}
