package com.springbootaws.Threads;

public class JP16SumObserver<T> implements JP15ResultListener<Integer> {

	private String taskId;

	public JP16SumObserver(String taskId) {
		this.taskId = taskId;
	}

	@Override
	public void notifyResult(Integer result) {
		// TODO Auto-generated method stub
		System.out.println("Result for " + taskId + "----" + result);
	}
}
