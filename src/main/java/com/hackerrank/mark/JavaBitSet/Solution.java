package com.hackerrank.mark.JavaBitSet;

import java.util.*;

/*
 *   https://www.hackerrank.com/challenges/java-bitset/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bitSetSize = sc.nextInt();

        BitSet firstBitSet = new BitSet(bitSetSize);
        BitSet SecondBitSet = new BitSet(bitSetSize);

        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            String command = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (command.equals("AND")) {
                if (x == 1)
                    firstBitSet.and(SecondBitSet);
                else
                    SecondBitSet.and(firstBitSet);
            }

            if (command.equals("OR")) {
                if (x == 1)
                    firstBitSet.or(SecondBitSet);
                else
                    SecondBitSet.or(firstBitSet);
            }

            if (command.equals("XOR")) {
                if (x == 1)
                    firstBitSet.xor(SecondBitSet);
                else
                    SecondBitSet.xor(firstBitSet);
            }

            if (command.equals("SET")) {
                if (x == 1)
                    firstBitSet.set(y);
                else
                    SecondBitSet.set(y);
            }

            if (command.equals("FLIP")) {

                if (x == 1)
                    firstBitSet.flip(y);
                else
                    SecondBitSet.flip(y);
            }

            System.out.printf("%d %d%n", firstBitSet.cardinality(), SecondBitSet.cardinality());

        }
        sc.close();
    }
}

