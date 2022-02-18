package com.hackerrank.mark.utopianTree;

import java.io.*;
import java.util.stream.*;

/*
 *   https://www.hackerrank.com/challenges/utopian-tree/problem
 */
class Result {
    public static int utopianTree(int n) {
        if (n == 0) {
            return 1;
        }
        int x = 0;
        if (n % 2 == 0) {
            n = n / 2;
            for (int i = 0; i <= n; i++) {
                x = x * 2 + 1;
            }
        } else {
            n = (n + 1) / 2;
            for (int i = 0; i <= n; i++) {
                x = x * 2 + 1;
            }
            x -= 1;
        }

        return x;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.utopianTree(n);

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

