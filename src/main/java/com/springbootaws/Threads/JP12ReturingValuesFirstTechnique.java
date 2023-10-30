package com.springbootaws.Threads;

public class JP12ReturingValuesFirstTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentThread = Thread.currentThread().getName();
		System.out.println("currentThread :: " + currentThread);

		JP13ValueReturningTaskA task1 = new JP13ValueReturningTaskA(2, 3, 1000);
		Thread t1 = new Thread(task1, "Thread-1");
		t1.start();

		JP13ValueReturningTaskA task2 = new JP13ValueReturningTaskA(4, 5, 500);
		Thread t2 = new Thread(task2, "Thread-2");
		t2.start();

		JP13ValueReturningTaskA task3 = new JP13ValueReturningTaskA(6, 7, 200);
		Thread t3 = new Thread(task3, "Thread-3");
		t3.start();

		System.out.println("Result-1 == " + task1.get());
		System.out.println("Result-2 == " + task2.get());
		System.out.println("Result-3 == " + task3.get());

		System.out.println("currentThread :: End" + currentThread);
	}

}
