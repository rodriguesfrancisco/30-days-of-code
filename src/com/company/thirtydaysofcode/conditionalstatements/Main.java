package com.company.thirtydaysofcode.conditionalstatements;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        boolean even = N % 2 == 0;

        if(!even)
            System.out.println("Weird");

        if(even && (N >= 2 && N <= 5))
            System.out.println("Not Weird");

        if(even && (N >= 6 && N <= 20))
            System.out.println("Weird");

        if(even && N > 20)
            System.out.println("Not Weird");

        scanner.close();
    }
}
