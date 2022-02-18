package com.hackerrank.mark.beautifulDaysAtTheMovies;

import java.io.*;

/*
 *  https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
class Result {
    public static int beautifulDays(int i, int j, int k) {
        int counter = 0;
        for (int k2 = i; k2 <= j; k2++) {
            double preDivision = (Math.abs(k2 - getReversedNum(k2))) / (double) k;
            if (preDivision % 1 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int getReversedNum(int number) {
        StringBuilder reverse = new StringBuilder();
        while (number > 0) {
            reverse.append(number % 10);
            number = number / 10;
        }
        return Integer.parseInt(reverse.toString());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

