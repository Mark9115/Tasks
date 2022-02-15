package com.hackerrank.mark.flippingTheMatrix;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/*
 *   https://www.hackerrank.com/challenges/flipping-the-matrix/problem
 */

class Result {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int r1, r2, c1, c2;
        int n = matrix.size() / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r1 = i;
                r2 = 2 * n - i - 1;
                c1 = j;
                c2 = 2 * n - j - 1;

                sum += Math.max(Math.max(matrix.get(r1).get(c1), matrix.get(r1).get(c2)),
                        Math.max(matrix.get(r2).get(c1), matrix.get(r2).get(c2)));
            }
        }

        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

