package com.hackerrank.mark.timeConversion;
import java.io.*;

/*
* https://www.hackerrank.com/challenges/time-conversion/problem
*/
class Result {

    public static String timeConversion(String s) {
        String timeOfDay = s.substring(s.length()-2).toLowerCase();
        s = s.substring(0,s.length()-2);

        if(timeOfDay.equals("pm"))
            if(Integer.parseInt(s.substring(0,2)) < 12){
                return (Integer.parseInt(s.substring(0,2)) + 12 + s.substring(2));
            }else
                return s;

        else if(timeOfDay.equals("am")){
            if(Integer.parseInt(s.substring(0,2)) >= 12){
                return "0" + (Integer.parseInt(s.substring(0,2)) - 12 + s.substring(2));
            }else
                return s;
        }else
            return "Wrong time!";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

