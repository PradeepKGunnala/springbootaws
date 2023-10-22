package com.springbootaws.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<Integer> filterList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12,
		// 13, 14, 15);

		List<Integer> filterList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15);
		System.out.println(filterList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

		List<String> names = Arrays.asList("Pradeep", "Manu", "Laksh");
		names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(names.stream().map(String::length).collect(Collectors.toList()));
		System.out.println(names.stream().collect(Collectors.toMap(n -> n, String::length)));
		Map<String, Integer> collect = names.stream().collect(Collectors.toMap(n -> n, String::length));
		collect.forEach((p, s) -> System.out.println("P-" + p + "--S--" + s));

		List<Integer> duplicateList = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 12, 13, 13, 14,
				15);
		Map<Integer, Long> collect2 = duplicateList.stream()
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		System.out.println(
				duplicateList.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())));

		List<Integer> collect3 = collect2.entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(collect3);

		List<Integer> sum = Arrays.asList(1, 2, 3, 4);
		sum.stream().reduce(0, Integer::sum);
		List<Integer> agg = Arrays.asList(1, 2, 3, 4);
		agg.stream().max(Integer::compare);
		agg.stream().min(Integer::compare);

		List<String> namess = Arrays.asList("Pradeep", "John", "Jane", "Tom");
		namess.stream().sorted().collect(Collectors.toList());

		List<String> namesb = Arrays.asList("Pradeep", "Alice", "Bob", "Charlie", "David");
		namesb.sort((a, b) -> a.compareTo(b));

		int[] numbers = { 5, 2, 8, 1, 9 };
		Arrays.sort(numbers);

		List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date");
		words.sort(Comparator.comparing(String::length));

		String[] strL = { "flower", "flow", "fly" };
		Arrays.stream(strL).reduce((s1, s2) -> {
			int i = 0;
			while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
				i++;
			}
			return s1.substring(0, i);
		});

		String st1 = "listen";
		String st2 = "silent";

		st1.chars().sorted().toArray().equals(st2.chars().sorted().toArray());

		String str13 = "racecar";
		IntStream.range(0, str13.length() / 2).mapToObj(i -> str13.charAt(i) == str13.charAt(str13.length() - 1 - i));
		IntStream.range(0, str13.length() / 2).allMatch(i -> str13.charAt(i) == str13.charAt(str13.length() - i - 1));

		String name = "PRADEEP 8";
		IntStream.range(0, name.length()).mapToObj(i -> name.charAt(name.length() - i - 1)).map(String::valueOf)
				.collect(Collectors.joining());

		String collect12 = IntStream.range(0, name.length()).mapToObj(i -> name.charAt(name.length() - i - 1))
				.map(String::valueOf).collect(Collectors.joining());

	}
}
