package com.hackerrank.mark.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://www.hackerrank.com/challenges/staircase/problem
 */

class Result {
    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        Result.staircase(n);

        bufferedReader.close();
    }
}
