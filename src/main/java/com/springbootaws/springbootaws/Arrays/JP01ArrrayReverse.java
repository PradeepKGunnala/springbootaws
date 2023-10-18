package com.springbootaws.springbootaws.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JP01ArrrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 4, 1, 3 };
		reverseIntegerArray(arr);
	}

	private static void reverseIntegerArray(int[] arr) {
		// TODO Auto-generated method stub
		IntStream.range(0, arr.length / 2).forEach(i -> {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		});
		System.out.println(Arrays.toString(arr));
	}
}
