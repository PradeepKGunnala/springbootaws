package com.springbootaws.Threads;

import java.util.concurrent.TimeUnit;

//This is used in scenarios of fire and forget - Also called as Ballestic Threads

class JP05LoopTaskA implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("###### <TASK ID --" + id + "-- STARTED ######");
		for (int i = 0; i < 10; i++) {
			System.out.println(+id + "--TICK TICK---" + i);
			try {
				TimeUnit.MICROSECONDS.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("###### <TASK ID --" + id + "-- Ended ######");
	}

	public JP05LoopTaskA() {
		this.id = ++count;
	}
}
