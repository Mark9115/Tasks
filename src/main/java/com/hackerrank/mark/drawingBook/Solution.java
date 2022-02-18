package com.hackerrank.mark.drawingBook;

import java.io.*;

/*
 *   https://www.hackerrank.com/challenges/drawing-book/problem
 */
class Result {

    public static int pageCount(int n, int p) {
        int fromFirst = p / 2;
        int fromLast = n / 2 - p / 2;
        return Math.min(fromFirst, fromLast);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

