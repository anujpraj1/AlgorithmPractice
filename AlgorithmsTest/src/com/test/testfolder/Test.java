package com.test.testfolder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hi There !!");
		int[] arr1 = { 20, 30 };
		int[] arr2 = { 50, 60 };
		String a = "20";
		String b = "30";

		System.out.println("A & B is :: " + a + " " + b);
		swap(arr1[0], arr2[0]);

		System.out.println("A & B is :: " + a + " " + b);
		
		List<String> abc = new ArrayList<>();
		abc.set(1, "ELEMENT");
		
		List<String> def = new LinkedList<>();
		def.set(1, "ELE");
	}

	private static void swap(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("A & B is :: " + a + " " + b);
	}
}
