package com.test.array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) throws IOException /*{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int inputArrayCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> inputArray = new ArrayList<>();

        for (int i = 0; i < inputArrayCount; i++) {
            String inputArrayItem = bufferedReader.readLine();
            inputArray.add(inputArrayItem);
        }

        int burstLength = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.getShrunkArray(inputArray, burstLength);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }*/{
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");
        input.add("d");
        input.add("c");
        input.add("c");
        input.add("c");
        input.add("d");
        input.add("d");
        input.add("e");
        input.add("e");

        int burstLength = 3;


        List<String> result = Result.getShrunkArray(input, burstLength);
        System.out.println(result);

    }
}