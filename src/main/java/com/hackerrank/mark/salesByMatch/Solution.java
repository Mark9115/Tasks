package com.hackerrank.mark.salesByMatch;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/*
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        Collections.sort(ar);
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if (ar.get(i).equals(ar.get(j))) {
                    ar.set(i, -1);
                    ar.set(j, -1);
                    count++;
                    break;
                }
            }
        }

        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

