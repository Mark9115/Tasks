package com.hackerrank.mark.divisibleSumPairs;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/*
 *   https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
class Result {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) continue;

                int x = ar.get(i) + ar.get(j);
                if (x % k == 0)
                    count++;
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
