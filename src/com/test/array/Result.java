package com.test.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'getShrunkArray' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY inputArray
     *  2. INTEGER burstLength
     */

    public static List<String> getShrunkArray(List<String> inputArray, int burstLength) /*{
        Map<String, Integer> characterAndCountMap = new HashMap<>();
        for ( int i = 0; i<inputArray.size(); i++) {
            String currChar = inputArray.get(i);
            if (characterAndCountMap.containsKey(currChar)) {
                int count = characterAndCountMap.get(currChar);
                count++;
                characterAndCountMap.put(currChar, count);
            } else {
                characterAndCountMap.put(currChar, 1);
            }
        }

        List<String> litToReturn = new ArrayList<>();
        characterAndCountMap.entrySet().stream().forEach(e-> {
            if (e.getValue() <= 3) {
                for (int i = 0; i<e.getValue(); i++) {
                    litToReturn.add(e.getKey());
                }
            }
        });
        return litToReturn;

    }*/{
        int counter = 1;
        //int tempBurstLength = 0;
        boolean foundAMatch = false;
        boolean removeEle = false;
        for (int i = 0 ; i<inputArray.size(); i++) {
            if (i!=0) {
                if (inputArray.get(i).equals(inputArray.get(i-1))) {
                    System.out.println("Here ");
                    System.out.println(counter);
                    counter++;
                }
                if (counter >= burstLength) {
                    System.out.println(counter);
                    for (int j = 0; j<burstLength; j++) {
                        inputArray.remove(i--);
                    }
                    counter = 1;
                }
            }
        }
        return inputArray;
    }

}
