package com.hackerrank.mark.encryption;

import java.io.*;
/*
*   https://www.hackerrank.com/challenges/encryption/problem
*/
class Result {
    public static String encryption(String s) {
        double sqrt = Math.sqrt(s.length());
        int rows = (int) Math.floor(sqrt);
        int cols = (int) Math.ceil(sqrt);
        int start = 0;

        if (cols * rows < s.length())
            rows++;

        char[] charString = s.toCharArray();
        char[][] arrayString = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (start + j > s.length() - 1)
                    break;
                arrayString[i][j] = charString[start + j];
            }
            start += cols;
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (arrayString[j][i] == 0) break;
                res.append(arrayString[j][i]);
            }
            res.append(" ");
        }
        return res.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

