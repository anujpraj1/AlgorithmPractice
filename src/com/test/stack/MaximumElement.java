package com.test.stack;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int noOfOperations = Integer.parseInt(scanner.nextLine());
        int max = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i<noOfOperations; i++) {
            String[] arrItems = scanner.nextLine().split(" ");
            int operationType = Integer.parseInt(arrItems[0]);
            switch(operationType) {
                case 1 :
                    int val = Integer.parseInt(arrItems[1]);
                    max = Math.max(val,max);
                    stk.push(max);
                    break;
                case 2 :
                    if (!stk.isEmpty()) {
                        stk.pop();
                    }
                    if (stk.isEmpty()) {
                        max = 0;
                    }
                    else {
                        max = stk.peek();
                    }
                    break;
                case 3 :
                    if (!stk.isEmpty()) {
                        System.out.println(stk.peek());
                        }
                    break;
                default :
                    System.out.println("Invalid Choice");
            }
        }
        scanner.close();
    }
}

