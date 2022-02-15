package com.hackerrank.mark.angryProfessor;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/*
 *   https://www.hackerrank.com/challenges/angry-professor/problem
 */
class Result {

    public static String angryProfessor(int k, List<Integer> a) {
        int count = 0;
        String decision;
        for (Integer integer : a) {
            if (integer <= 0)
                count++;
        }
        if (count < k)
            decision = "YES";
        else
            decision = "NO";
        return decision;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt).toList();

                String result = Result.angryProfessor(k, a);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

