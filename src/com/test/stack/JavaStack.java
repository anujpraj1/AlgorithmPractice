package com.test.stack;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("{}()");
        stack.push("({()})");
        stack.push("{}(");
        stack.push("[]");

        stack.forEach(element -> System.out.println(balancedString(element)));
    }

    private static boolean balancedString(String string){
        while(string.length() != (string = string.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
        return (string.isEmpty());
    }
}