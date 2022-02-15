package com.hackerrank.mark.dayOfTheProgrammer;

import java.io.*;

/*
 *    https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
class Result {

    public static String dayOfProgrammer(int year) {
        String res;
        if (year < 1917) {
            res = "13.09." + year;

            if (year % 4 == 0) {
                res = "12.09." + year;
            }
        } else if (year == 1918) {
            res = "26.09." + year;
        } else {
            res = "13.09." + year;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                res = "12.09." + year;
            }
        }

        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

