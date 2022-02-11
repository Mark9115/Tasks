package com.hackerrank.mark.diagonalDifference;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;
/*
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int right = 0;
        int left = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0, k = arr.size() - 1; j < arr.size(); j++, k--) {
                if (i == j) {
                    left += arr.get(i).get(j);
                    right += arr.get(i).get(k);
                }
            }
        }
        return Math.abs(left - right);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

