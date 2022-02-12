package com.hackerrank.mark.appleAndOrange;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;
/*
*    https://www.hackerrank.com/challenges/apple-and-orange/problem
*/
class Result {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int orangesCount = 0;
        int applesCount = 0;

        for (int i = 0; i < apples.size(); i++) {
            apples.set(i, apples.get(i) + a);
            if (apples.get(i) >= s && apples.get(i) <= t) {
                applesCount++;
            }
        }
        for (int i = 0; i < oranges.size(); i++) {
            oranges.set(i, oranges.get(i) + b);
            if (oranges.get(i) >= s && oranges.get(i) <= t) {
                orangesCount++;
            }

        }

        System.out.println(applesCount);
        System.out.println(orangesCount);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}

