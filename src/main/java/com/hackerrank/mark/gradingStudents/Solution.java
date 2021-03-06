package com.hackerrank.mark.gradingStudents;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int nextMultiple = 5;
        int threshold = 38;
        int difference = 3;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < threshold)
                continue;
            if (grades.get(i) % nextMultiple != 0) {
                int realScore = grades.get(i);
                int nextScore = grades.get(i) + (nextMultiple - grades.get(i) % nextMultiple);

                if (nextScore - realScore < difference)
                    grades.set(i, nextScore);
                else
                    grades.set(i, realScore);
            }
        }
        return grades;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

