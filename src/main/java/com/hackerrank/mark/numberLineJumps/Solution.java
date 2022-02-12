package com.hackerrank.mark.numberLineJumps;

import java.io.*;

/*
* https://www.hackerrank.com/challenges/kangaroo/problem
*/

class Result {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int res1 = x1;
        int res2 = x2;
        if (v1 < v2)
            return "NO";
        while (res1 < res2) {
            res1 += v1;
            res2 += v2;
        }
        if (res1 != res2)
            return "NO";
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

