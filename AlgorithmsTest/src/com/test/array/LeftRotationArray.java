package com.test.array;

import java.util.Scanner;

public class LeftRotationArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int d = 4;

        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        while (d!=0) {
            int temp = 0;
            temp = a[0];
            a[0] = a[a.length-1];
            a[a.length-1] = temp;
            for ( int i =0; i<(a.length-2);i++) {
                if ((i+1)<=a.length-2)
                {
                     temp = a[i];
                     a[i] = a[i+1];
                     a[i+1] = temp;
                }               
            }
            d--;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }

        scanner.close();
    }
}

