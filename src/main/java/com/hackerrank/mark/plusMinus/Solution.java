package com.hackerrank.mark.plusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/*
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem
 */

class Result {
    public static void plusMinus(List<Integer> arr) {
        List<Double> result = new ArrayList<>(Collections.nCopies(3, 0.0));
        for (Integer i : arr) {
            if (i > 0)
                result.set(0, result.get(0) + 1);
            else if (i < 0)
                result.set(1, result.get(1) + 1);
            else
                result.set(2, result.get(2) + 1);
        }

        for (Double i : result)
            System.out.printf("%.6f\n", i / arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

