package com.springbootaws.Threads;

public class JP09NamingThreadFirstTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainThread = Thread.currentThread().getName();
		System.out.println("Main Thread Start Here" + mainThread);
		new Thread(new JP09LoopTaskB()).start();

		Thread t2 = new Thread(new JP09LoopTaskB());
		t2.start();

		System.out.println("Main Thread End Here" + mainThread);
	}

}
