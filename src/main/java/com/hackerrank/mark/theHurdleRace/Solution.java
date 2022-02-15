package com.hackerrank.mark.theHurdleRace;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/*
 *   https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
class Result {

    public static int hurdleRace(int k, List<Integer> height) {
        int max = height.get(0);
        for (int i = 1; i < height.size(); i++) {
            if (max < height.get(i))
                max = height.get(i);
        }

        if (k > max) return 0;
        return max - k;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

