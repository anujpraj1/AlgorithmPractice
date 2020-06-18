package com.test.stack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualStacksNonOptimal {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
    	List<Integer> sumH1 = new ArrayList<>();
    	int totalH1 = 0; 
    	for (int i=h1.length-1; i>=0 ; i--) {
    		totalH1 += h1[i];
    		sumH1.add(totalH1);
    	}
    	System.out.println("List 1 :: "+sumH1);
    	List<Integer> sumH2 = new ArrayList<>();
    	int totalH2 = 0; 
    	for (int i=h2.length-1; i>=0 ; i--)  {
    		totalH2 += h2[i];
    		if (sumH1.contains(totalH2)) {
    			sumH2.add(totalH2);
    		}
    	}
    	System.out.println("List 2 :: "+sumH2);
    	List<Integer> sumH3 = new ArrayList<>();
    	int totalH3 = 0; 
    	for (int i=h3.length-1; i>=0 ; i--) {
    		totalH3 += h3[i];
    		if (sumH2.contains(totalH3)) {
    			sumH3.add(totalH3);
    		}
    	}
    	System.out.println("List 3 :: "+sumH3);
    	int max = 0;
    	for (int sum3Val : sumH3) {
    		max = Math.max(max, sum3Val);
    	}

        return max;

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        System.out.println("Result is :: "+result);
    }
}
