package com.springbootaws.Threads;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JP18ReturningValuesUsingExecutor_FirstTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String currentThread = Thread.currentThread().getName();
		System.out.println("currentThread :: " + currentThread);
		ExecutorService execService = Executors.newCachedThreadPool();

		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(execService);
		completionService.submit(new JP19CalculateTaskA(2, 3, 2000));
		completionService.submit(new JP19CalculateTaskA(4, 5, 1000));
		completionService.submit(new JP19CalculateTaskA(5, 7, 500));
		// Future<?> result4 = execService.submit(new JP05LoopTaskA());
		completionService.submit(new JP05LoopTaskA(), 99);

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println("Result" + completionService.take().get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		execService.shutdown();
		System.out.println("currentThread :: End" + currentThread);
	}
}
