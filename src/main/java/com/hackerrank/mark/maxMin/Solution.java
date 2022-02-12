package com.hackerrank.mark.maxMin;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;
/*
*   https://www.hackerrank.com/challenges/angry-children/problem
*/
class Result {

    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int minDiff = arr.get(k - 1) - arr.get(0);

        for (int i = 0; i <= arr.size() - k; i++) {
            if (minDiff > arr.get(i + k - 1) - arr.get(i)){
                minDiff = arr.get(i + k - 1) - arr.get(i);
            }
        }

        return minDiff;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.maxMin(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

