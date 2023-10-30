package com.springbootaws.Java8.StringExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JP01StringExample {

	public static void main(String[] args) {
		// --------------------------------------
		// 1.Split and Join
		// TODO Auto-generated method stub
		// --------------------------------------
		String str14 = "Java-8-Programming";
		// Spliting String
		String[] split = str14.split("-");
		// Printing Array stream and for each
		Arrays.stream(split).forEach(System.out::println);
		// Print as String
		String string = Arrays.toString(split);
		System.out.println(string);
		// Iterate using For Loop
		for (String str : split) {
			System.out.println(str);
		}
		// --------------------------------------
		// 2. Count letter m count
		// TODO Auto-generated method stub
		// --------------------------------------
		String text = "programming in Java 8 is fun";
		long count = text.chars().filter(c -> c == 'm').count();
		System.out.println("Count of Character m---" + count);
		// --------------------------------------
		// 3. Reverse a string using Java 8 features.
		// --------------------------------------
		String name = "PRADEEP 8";
		String collect = IntStream.range(0, name.length()).mapToObj(i -> name.charAt(name.length() - i - 1))
				.map(String::valueOf).collect(Collectors.joining());
		System.out.println("Reverse String \"PRADEEP 8\" --" + collect);
		StringBuilder sb = new StringBuilder(name).reverse();
		System.out.println(sb);
		// --------------------------------------
		// 4.Check if a string is a palindrome.
		// --------------------------------------
		String palindrome = "RACECAR";
		boolean allMatch = IntStream.range(0, palindrome.length() / 2)
				.allMatch(i -> palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
		System.out.println("Is Palindrome :: " + allMatch);
		// --------------------------------------
		// 5.Count the number of vowels in a string.
		// --------------------------------------
		String text1 = "Hello, World!";
		long count2 = text1.chars().filter(ch -> "AEIOUaeiou".indexOf(ch) >= 0).count();
		System.out.println("Count of Vowels in String" + count2);

		// 6.Count the number of words in a string:
		String sentence = "This is a sample sentence";
		String[] split2 = sentence.split("\\s+");
		System.out.println(Arrays.stream(split2).count());

		// 7. Remove Spaces
		String text2 = "   Remove  Spaces  ";
		String collect2 = text2.chars().filter(ch -> !Character.isWhitespace(ch))
				.mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		System.out.println("Remove Spaces__" + collect2);
		text2.chars().filter(ch -> !Character.isWhitespace(ch)).mapToObj(ch -> String.valueOf((char) ch))
				.collect(Collectors.joining());

		// 8 Check if a string contains only digits:
		String str12345 = "12345";
		// str12345.chars().allMatch(Character::isDigit);
		System.out.println("isDigit-->" + str12345.chars().allMatch(Character::isDigit));

		// 9.Convert a string to lowercase using Java 8:
		String textL = "Convert To Lowercase";
		System.out.println("Covert to LowerCase --" + textL.toLowerCase());
		System.out.println("Covert to UpperCase --" + textL.toUpperCase());

		// 10 Concatenate two strings using Java 8:
		String str1 = "Hello, ";
		String str2 = "World!";
		// String result = Stream.of(str1, str2).collect(Collectors.joining());
		String collect3 = Stream.of(str1, str2).collect(Collectors.joining());
		System.out.println(collect3);

		// 11.Split a String into words and Store them in list
		String sentence11 = "Split this sentence into words";
		String[] split3 = sentence11.split("\\s+");
		List<String> words11 = Arrays.stream(split3).collect(Collectors.toList());
		System.out.println(words11);

		// 12.Find the longest word in a string:
		String sentence12 = "Find the longest word in this string";
		String orElse = Arrays.stream(sentence12.split("\\s+")).max(Comparator.comparing(String::length)).orElse("");
		System.out.println("Find the longest word in this string ==" + orElse);

		// 13 Find the shortest word in a string:
		String orElse1 = Arrays.stream(sentence12.split("\\s+")).min(Comparator.comparing(String::length)).orElse("");
		System.out.println("Find the Shorted word in this string ==" + orElse1);

		// 14 Find the frequency of each word in a string:
		String sentence14 = "Count the frequency of each word in this sentence.";
		Map<String, Long> collect4 = Arrays.stream(sentence14.split("\\s+"))
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
		System.out.println(collect4);

		// 15 Check if two strings are anagrams:
		String str15 = "listen";
		String str152 = "silent";
		boolean equals = Arrays.equals(str15.chars().sorted().toArray(), str152.chars().sorted().toArray());
		System.out.println("Check if two strings are anagrams ::" + equals);
	}
}
