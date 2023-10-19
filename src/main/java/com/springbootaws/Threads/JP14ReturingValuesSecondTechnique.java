package com.springbootaws.Threads;

public class JP14ReturingValuesSecondTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentThread = Thread.currentThread().getName();
		System.out.println("currentThread :: " + currentThread);

		JP17ValueReturningTaskB task1 = new JP17ValueReturningTaskB(2, 3, 1000, new JP16SumObserver("task-1"));
		Thread t1 = new Thread(task1, "Thread-1");
		t1.start();

		JP17ValueReturningTaskB task2 = new JP17ValueReturningTaskB(4, 5, 500, new JP16SumObserver("task-2"));
		Thread t2 = new Thread(task2, "Thread-2");
		t2.start();

		JP17ValueReturningTaskB task3 = new JP17ValueReturningTaskB(6, 7, 200, new JP16SumObserver("task-3"));
		Thread t3 = new Thread(task3, "Thread-3");
		t3.start();

		System.out.println("currentThread :: End" + currentThread);
	}

}
