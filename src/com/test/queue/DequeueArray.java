package com.test.queue;

import java.util.*;

public class DequeueArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Deque deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        int currMaxNum = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (i == m-1) {
                list.clear();
            }
            if (list.contains(num)) {
                currMaxNum++;
            }
            System.out.println(currMaxNum);
            if (currMaxNum > max) {
                max = currMaxNum;
            }
        }
        System.out.println("Max :: "+max);
    }
}
