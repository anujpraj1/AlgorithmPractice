package com.test.array;

import java.util.*;

public class Java1DArrayGameActual {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] arr, int currIndex) {
        // Condition which will take care of terminating condition where first index is 1 also if
        if (currIndex < 0 || arr[currIndex] == 1)
            return false;
        // If CurrIndex reaches till length of the array or currIndex+ leap reaches the array
        if ((currIndex == arr.length - 1) || currIndex + leap > arr.length - 1)
            return true;

        // Making Index 1 else second condition will break
        arr[currIndex] = 1;
        // We will check for adjacent element first
        return isSolvable(leap, arr, currIndex + 1) ||
                // Now will check for previous element
                isSolvable(leap, arr, currIndex - 1) ||
                // Now will check for currIndex+leap positioned element which will again check for this iteration
                isSolvable(leap, arr, currIndex + leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}