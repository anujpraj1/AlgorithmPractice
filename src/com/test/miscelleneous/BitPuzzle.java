package com.test.miscelleneous;

import java.util.Arrays;
import java.util.Comparator;

class BitPuzzle {
    static boolean isAnagram(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        sortString(a);
        System.out.println("A :: "+sortString(a));
        System.out.println("B :: "+sortString(b));
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        for (char currA : aArray) {
            sbA.append(currA);
        }
        for (char currB : bArray) {
            sbB.append(currB);
        }
        if (sbA.toString().equals(sbB.toString())) {
            return true;
        } else {
            return false;
        }
    }

    private static String sortString(String high) {
        String b = high.toLowerCase();
        System.out.println("HIGH :: "+b);
        StringBuilder sortedString = new StringBuilder();
        char[] a = high.toCharArray();
        for (int i = 0; i<a.length; i++) {
            for (int j = i+1 ; j<a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (char currA : a) {
            sortedString.append(currA);
        }
        return sortedString.toString();
    }


    public static void main(String[] args) {

        String a= "Hello";
        String b= "hello";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
