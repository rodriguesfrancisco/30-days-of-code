package com.company.thirtydaysofcode.letsreview;

import java.io.*;
import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 0; i < n; i++) {
            String s = scanner.next();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char[] charArr = s.toCharArray();
            String odd = "";
            String even = "";
            for(int j = 0; j < charArr.length; j++) {
                if(j % 2 == 0)
                    even+= charArr[j];
                else
                    odd+= charArr[j];
            }

            System.out.println(even + " " + odd);
        }
    }
}