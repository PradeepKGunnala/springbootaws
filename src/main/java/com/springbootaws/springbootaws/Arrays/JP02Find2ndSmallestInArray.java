package com.springbootaws.springbootaws.Arrays;

import java.util.Arrays;

public class JP02Find2ndSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = { 1 };
		int[] arr = { 5, 2, 3, 7, 1 };
		// Arrays.stream(arr).sorted().skip(1).findFirst().orElse(0);

		int orElseThrow = Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(IllegalStateException::new);
		System.out.println("Found Second Smallest Number" + orElseThrow);

	}

}
