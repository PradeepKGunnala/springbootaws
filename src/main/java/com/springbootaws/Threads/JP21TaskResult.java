package com.springbootaws.Threads;

import java.util.Objects;

public class JP21TaskResult<S, R> {

	public final S taskId;
	public final R result;

	public JP21TaskResult(S taskId, R result) {
		this.taskId = taskId;
		this.result = result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(result, taskId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		JP21TaskResult other = (JP21TaskResult) obj;
		return Objects.equals(result, other.result) && Objects.equals(taskId, other.taskId);
	}

	@Override
	public String toString() {
		return "----JP21TaskResult [taskId=" + taskId + ", result=" + result + "]-----";
	}

}
