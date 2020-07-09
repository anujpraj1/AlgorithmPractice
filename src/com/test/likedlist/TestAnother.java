package com.test.likedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class TestAnother {

	public static void main(String[] args) {
		System.out.println("One More Random Class");
		int[] arr = new int[5];
		System.out.println("Length of Array :: "+arr.length);

		int sum;
		int n = 12;
		System.out.println(String.valueOf(n));

		System.out.println(Math.pow(10,0));
		System.out.println("There"+(10^2));
		List<List<String>> abc = new ArrayList<>();
		List<String> a = new ArrayList<>();
		a.add("setPassword");
		a.add("000A");
		List<String> b = new ArrayList<>();
		b.add("authorize");
		b.add("108738450");
		/*abc.add(new ArrayList<>().add( 000A

				authorize 108738449
				authorize 244736787))*/
		List<String> c = new ArrayList<>();
		c.add("authorize");
		c.add("108738449");
		abc.add(a);
		abc.add(b);
		abc.add(c);
		System.out.println(authEvents(abc));

	}

	public static List<Integer> authEvents(List<List<String>> events) {
		List<Integer> listToReturn = new ArrayList<>();
		Set<String> validValues = new HashSet<>();
		for (List<String> currEvent : events) {
			if ("setPassword".equals(currEvent.get(0))) {
				validValues.clear();
				populateSetOfValidValues(validValues, currEvent.get(1));
			} else {
				if (validValues.contains(currEvent.get(1))) {
					listToReturn.add(1);
				} else {
					listToReturn.add(0);
				}
			}
		}
		return listToReturn;
	}

	public static void populateSetOfValidValues(Set<String> validValues, String password) {
		Integer valueToStore = 0;
		int counter = 0;
		for (int c = 0; c<=127; c++) {
			if (c != 0) {
				password.concat(String.valueOf(c));
			}
			int len = password.length();
			for (int i = len-1; i>=0; i--) {
				char currChar = password.charAt(i);
				int asciival = 0;
				if (i == len-1 && c!=0) {
					asciival = c;
				} else {
					asciival = (int) currChar;
				}
				int power = (int)(Math.pow(131, counter));
				valueToStore += asciival*power;
				counter++;
			}
			valueToStore = valueToStore%1000000007;
			validValues.add(String.valueOf(valueToStore));
		}
	}

}
