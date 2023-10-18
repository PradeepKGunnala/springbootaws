package com.springbootaws.springbootaws.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JP03FindCommonElementBtw2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1 = { 1, 2, 3, 4, 5 };
		int[] arry2 = { 4, 5, 6, 7, 8, 9 };

		List<Integer> collectList = Arrays.stream(arry1)
				.filter(num1 -> Arrays.stream(arry2).anyMatch(num2 -> num1 == num2)).boxed()
				.collect(Collectors.toList());
		System.out.println(collectList);

	}

}
