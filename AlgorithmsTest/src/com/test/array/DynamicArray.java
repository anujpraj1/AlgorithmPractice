package com.test.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        List<List <Integer>> dynamicArray = new ArrayList<>();
        for (int i=0 ; i<n ; i++) {
            List<Integer> dynamicList = new ArrayList<>();
            dynamicArray.add(dynamicList);
        }
        int lastAnswer = 0;
        for (List<Integer> currentQuery : queries) {
            int queryType = currentQuery.get(0);
            int valueOfX = currentQuery.get(1);
            int valueOfY = currentQuery.get(2);
            if (queryType == 1) {
                int foundSeq = ((valueOfX^lastAnswer) % n);
                List<Integer> foundSqInArr = dynamicArray.get(foundSeq);
                foundSqInArr.add(valueOfY);

            }else {
                int foundSeq = ((valueOfX^lastAnswer) % n);
                List<Integer> foundSqInArr = dynamicArray.get(foundSeq);
                lastAnswer = foundSqInArr.get(valueOfY%(foundSqInArr.size()));
                result.add(lastAnswer);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
