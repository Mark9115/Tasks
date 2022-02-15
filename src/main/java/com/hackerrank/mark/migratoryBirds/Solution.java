package com.hackerrank.mark.migratoryBirds;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/*
 *   https://www.hackerrank.com/challenges/migratory-birds/problem
 */
class Result {
    public static int migratoryBirds(List<Integer> arr) {
        int[] types = new int[5 + 1];
        for (int i = 0; i < arr.size(); i++) {
            types[arr.get(i)]++;
        }

        int max = types[0];
        int count = 0;
        for (int i = 1; i < types.length; i++) {

            if (types[i] > max) {
                max = types[i];
                count = i;
            }
        }

        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

