package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int counterOfNegativeSum = 0;
        int arrSize = arr.length;
        for (int i = 0; i < arrSize; i++) {
            int sum = 0;
            for (int j = i; j < arrSize; j++) {
                if (i == j) {
                    sum += arr[i];
                    if (arr[i] < 0) {
                        counterOfNegativeSum++;
                    }
                } else {
                    sum += arr[j];
                    if (sum < 0) {
                        counterOfNegativeSum++;
                    }
                }
            }
        }
        System.out.println("Counter :: "+counterOfNegativeSum);
    }
}
