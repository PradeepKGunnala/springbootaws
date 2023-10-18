package com.springbootaws.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JP06FixedPoolExecutorService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAIN Thread");
		ExecutorService e = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 6; i++) {
			// e.submit(new JP05LoopTaskA()); // This return value Future
			e.execute(new JP05LoopTaskA()); // this doesn't return value and it runs at descretion of Executor Service
		}
		e.shutdown();
		System.out.println("MAIN Completed");
	}
}
