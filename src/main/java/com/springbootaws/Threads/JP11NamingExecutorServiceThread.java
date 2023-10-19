package com.springbootaws.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JP11NamingExecutorServiceThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String mainThread = Thread.currentThread().getName();
		System.out.println("Main Thread Start Here" + mainThread);

		ExecutorService e = Executors.newCachedThreadPool(new NamedThreadsFactory());

		for (int i = 0; i < 3; i++) {
			e.execute(new JP10LoopTaskC());
			// new Thread(new JP09LoopTaskB());
		}

		TimeUnit.SECONDS.sleep(5);
		System.out.println("Submitting more task now--");
		for (int i = 0; i < 10; i++) {
			e.execute(new JP10LoopTaskC());
			// new Thread(new JP09LoopTaskB());
		}

		e.shutdown();

		System.out.println("Main Thread End Here" + mainThread);
	}

}
