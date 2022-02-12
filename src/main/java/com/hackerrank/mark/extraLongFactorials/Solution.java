package com.hackerrank.mark.extraLongFactorials;

import java.io.*;
import java.math.*;

/*
 *   https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */

class Result {
    public static void extraLongFactorials(int n) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = n; i >= 1; i--) {
            BigInteger bigIntegers = new BigInteger(String.valueOf(i));
            bigInteger = bigInteger.multiply(bigIntegers);
        }

        System.out.println(bigInteger);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}

