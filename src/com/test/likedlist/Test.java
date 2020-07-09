package com.test.likedlist;

import java.util.*;
class Test{

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
			System.out.println(wellFomed(input));
		}

	}

	private static String wellFomed(String input) {
		int lenghtOfString = input.length();
		Stack<Character> stk = new Stack();
		for (int i = 0; i<lenghtOfString; i++) {
			char currChar = input.charAt(i);
			switch(currChar) {
				case '{':
				case '(':
				case '[':
					stk.push(currChar);
					break;
				case '}':
					if (!stk.isEmpty() && stk.pop() != '{') {
						return "false";
					}
					break;
				case ')':
					if (!stk.isEmpty() && stk.pop() != '(') {
						return "false";
					}
					break;
				case ']':
					if (!stk.isEmpty() && stk.pop() != '[') {
						return "false";
					}
					break;
				default:
					System.out.println("Wrong Input");
			}
		}
		return stk.isEmpty() ? "true" : "false";
	}
}



