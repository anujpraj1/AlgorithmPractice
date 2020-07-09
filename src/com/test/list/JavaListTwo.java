package com.test.list;

import java.io.*;
import java.util.*;

public class JavaListTwo {
    /*5
            12 0 1 78 12
            1
    Insert
5 23*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfElements = sc.nextInt();
        List<Integer> listStr = new ArrayList<>();
        for (int i = 0; i<noOfElements; i++) {
            listStr.add(sc.nextInt());
        }
        int noOfQueries = sc.nextInt();
        for (int i = 0; i<noOfQueries ; i++) {
            String operation = sc.next();
            if ("Insert".equals(operation)) {
                int positionToInsert = sc.nextInt();
                int recordToInsert = sc.nextInt();
                listStr.add(positionToInsert, recordToInsert);
            } else {
                int recordPosToDelete = sc.nextInt();
                listStr.remove(recordPosToDelete);
            }
        }
        listStr.stream().forEach(e -> {
            System.out.print(e+ " ");
        });
    }
}