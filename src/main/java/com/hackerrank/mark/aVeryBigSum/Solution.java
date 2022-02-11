package com.hackerrank.mark.aVeryBigSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/*
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */

class Result {

    public static long aVeryBigSum(List<Long> ar) {
        long res = 0;
        for (long lg : ar) {
            res += lg;
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong).toList();

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}






