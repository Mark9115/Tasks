package com.hackerrank.mark.breakingTheRecords;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 *   https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
class Result {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = min;
        int countMin = 0;
        int countMax = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (min > scores.get(i)) {
                min = scores.get(i);
                countMin++;
            }

            if (max < scores.get(i)) {
                max = scores.get(i);
                countMax++;
            }
        }

        List<Integer> count = new ArrayList<>();
        Collections.addAll(count, countMax, countMin);
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

