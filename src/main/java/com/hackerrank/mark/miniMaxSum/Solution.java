package com.hackerrank.mark.miniMaxSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;
/*
* https://www.hackerrank.com/challenges/mini-max-sum/problem
*/
class Result {

    public static void miniMaxSum(List<Integer> arr) {
        final int countOfPickingIntegers = 4;
        Collections.sort(arr);
        long min = 0, max = 0;
        for (int i = 0; i < countOfPickingIntegers; i++) {
            min += arr.get(i);
            max += arr.get(arr.size() - 1 - i);
        }
        System.out.println(min + " " + max);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
