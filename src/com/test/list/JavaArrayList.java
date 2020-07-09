package com.test.list;

import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<Integer>> mapOfLists = new HashMap<>();
        int numberOfList = sc.nextInt();
        int counter = 1;
        for (int i = 0; i<numberOfList; i++) {
            int numberOfElement = sc.nextInt();
            if (numberOfElement == 0) {
                counter++;
                continue;
            }
            List<Integer> listOfIntegers = new ArrayList<>();
            for (int j = 0; j <numberOfElement; j++) {
                listOfIntegers.add(sc.nextInt());
            }
            mapOfLists.put(counter, listOfIntegers);
            counter++;
    }
        int noOfQueries = sc.nextInt();
        for (int i = 0; i<noOfQueries; i++) {
            int listNo = sc.nextInt();
            int postion = sc.nextInt();
            if (mapOfLists.containsKey(listNo)) {
                List<Integer> list = mapOfLists.get(listNo);
                if (list.size() < postion) {
                    System.out.println("ERROR!");
                } else {
                    System.out.println(list.get(postion-1));
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}