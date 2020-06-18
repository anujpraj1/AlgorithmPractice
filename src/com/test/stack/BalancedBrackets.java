package com.test.stack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> charStk = new Stack<>();
        for (int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            switch (c) {
            case '[' :
            case '{' :
            case '(' :
                charStk.push(c);
                break;
            case '}' :
                //char poppedChar = charStk.pop();
                if (!charStk.isEmpty() && charStk.pop() != '{') {
                    return "NO";
                }
                break;
            case ']' :
                if (!charStk.isEmpty() && charStk.pop() != '[') {
                    return "NO";
                }
                break;
            case ')' :
                if (!charStk.isEmpty() && charStk.pop() != '(') {
                    return "NO";
                }
                break;
            default :
                System.out.println("Invalid Character");
            }
        }
        return charStk.isEmpty() ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            System.out.println(result);
           // bufferedWriter.write(result);
           // bufferedWriter.newLine();
        }

       // bufferedWriter.close();

        scanner.close();
    }
}

