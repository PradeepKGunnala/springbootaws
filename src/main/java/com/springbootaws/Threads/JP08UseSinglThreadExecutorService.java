package com.springbootaws.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * In summary, the primary difference between 
 * submit and execute is in their return types 
 * and intended use cases. Use submit when you
 * want to monitor the task's progress and
 * retrieve results, and use execute when 
 * you simply want to submit a task for 
 * execution without expecting any result.
 * Both methods are part of the ExecutorService interface, 
 * which provides a higher-level abstraction for managing
 * concurrent tasks in Java.
 */

public class JP08UseSinglThreadExecutorService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAIN Thread");
		ExecutorService e = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 6; i++) {
			// e.submit(new JP05LoopTaskA()); // This return value Future
			e.execute(new JP05LoopTaskA()); // this doesn't return value and it runs at descretion of Executor Service
		}
		e.shutdown();
		System.out.println("MAIN Completed");
	}
}
