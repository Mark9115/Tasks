package com.hackerrank.mark.sequenceEquation;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 *   https://www.hackerrank.com/challenges/permutation-equation/problem
 */
class Result {
    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= p.size(); i++) {

            newList.add(p.indexOf(p.indexOf(i) + 1) + 1);
        }
        return newList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.permutationEquation(p);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

