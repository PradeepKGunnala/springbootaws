package com.springbootaws.Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JP20ReturningValuesUsingExecutor_2Technique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String currentThread = Thread.currentThread().getName();
		System.out.println("currentThread :: " + currentThread);
		ExecutorService execService = Executors.newCachedThreadPool();
		Future<Integer> result1 = execService.submit(new JP19CalculateTaskA(2, 3, 2000));
		Future<Integer> result2 = execService.submit(new JP19CalculateTaskA(4, 5, 1000));
		Future<Integer> result3 = execService.submit(new JP19CalculateTaskA(5, 7, 500));
		Future<?> result4 = execService.submit(new JP05LoopTaskA());
		Future<Double> result5 = execService.submit(new JP05LoopTaskA(), 99.908);
		execService.shutdown();
		try {
			System.out.println("Result -1 = " + result1.get());
			System.out.println("Result -2 = " + result2.get());
			System.out.println("Result -3 = " + result3.get());
			System.out.println("Result -4 = " + result4.get());
			System.out.println("Result -5 = " + result5.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("currentThread :: End" + currentThread);
	}
}
