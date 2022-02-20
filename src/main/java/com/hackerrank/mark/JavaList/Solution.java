package com.hackerrank.mark.JavaList;

import java.util.*;

/*
 *   https://www.hackerrank.com/challenges/java-list/problem
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int times = 0;

        while (times < q) {
            int value = sc.nextInt();
            list.add(value);
            times++;
        }

        int actions = sc.nextInt();
        int actionCount = 0;
        while (actionCount < actions) {
            String command = sc.next();
            if (command.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            }
            if (command.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
            actionCount++;
        }


        sc.close();

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
