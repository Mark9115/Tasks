package com.hackerrank.mark.birthdayCakeCandles;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;
/*
    https://www.hackerrank.com/challenges/birthday-cake-candles/problem
*/
class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        int count = 0;
        for (Integer candle : candles) {
            if (max == candle)
                count++;

            if (max < candle) {
                max = candle;
                count = 1;
            }

        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
