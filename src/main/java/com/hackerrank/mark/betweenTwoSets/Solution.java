package com.hackerrank.mark.betweenTwoSets;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/*
 *  https://www.hackerrank.com/challenges/between-two-sets/problem
 */
class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {

        if (a.get(a.size() - 1) > b.get(b.size() - 1))
            return 0;

        int lcmCount;
        int gcdCount;

        if (a.size() == 1) {
            lcmCount = a.get(0);
        } else {
            lcmCount = lcm(a.get(a.size() - 1), a.get(a.size() - 2));
            if (a.size() > 2) {
                for (int i = a.size() - 3; i >= 0; i--) {
                    lcmCount = lcm(lcmCount, a.get(i));
                }
            }
        }


        if (b.size() == 1) {
            gcdCount = b.get(0);
        } else {
            gcdCount = gcd(b.get(b.size() - 1), b.get(b.size() - 2));

            if (b.size() > 2) {
                for (int i = b.size() - 3; i >= 0; i--) {
                    gcdCount = gcd(gcdCount, b.get(i));
                }
            }
        }

        int counter = 0;
        int multipleOfLcm = lcmCount;
        while (multipleOfLcm <= gcdCount) {
            if (gcdCount % multipleOfLcm == 0)
                counter++;

            multipleOfLcm += lcmCount;
        }

        return counter;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


