package com.test.stack;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LargestRectangleNO {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
    	Arrays.sort(h);
        int i = 0;
        int j = h.length;
        long maxRectangle = 0;
        while (i != h.length) {
        	System.out.println("Inside While");
        	System.out.println("Value of Array Element :: "+h[i]);
        	System.out.println("Value of j :: "+j);
        	System.out.println("Performing Multiplication");
            maxRectangle = Math.max(maxRectangle, (h[i] * j));
            j--;
            i++;
        }
        return maxRectangle;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);
        System.out.println("Result is :: "+result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

