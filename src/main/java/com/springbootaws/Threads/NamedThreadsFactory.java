package com.springbootaws.Threads;

import java.util.concurrent.ThreadFactory;

public class NamedThreadsFactory implements ThreadFactory {
	private static int counter = 0;
	private static String NAME = "PoolWorker-";

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread t = new Thread(r, NAME + ++counter);
		System.out.println("T Name " + t.currentThread().getName());
		return t;
	}

}
