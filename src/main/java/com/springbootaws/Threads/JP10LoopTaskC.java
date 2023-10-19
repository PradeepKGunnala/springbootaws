package com.springbootaws.Threads;

import java.util.concurrent.TimeUnit;

//This is used in scenarios of fire and forget - Also called as Ballestic Threads

class JP10LoopTaskC implements Runnable {

	private static int count = 0;
	private int instance;
	private String taskId;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("worker thread " + instance);
		// String threadName = Thread.currentThread().getName();

		System.out.println(
				"###### [ " + Thread.currentThread().getName() + "  ]task id --" + taskId + "-- started ######");
		for (int i = 0; i < 10; i++) {
			System.out.println(taskId + "--TICK TICK---" + i);
			try {
				TimeUnit.MICROSECONDS.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out
				.println("###### [ " + Thread.currentThread().getName() + "  ]task id --" + taskId + "-- ended ######");
	}

	public JP10LoopTaskC() {
		this.instance = ++count;
		taskId = "LoopTaskC" + instance;
	}
}
