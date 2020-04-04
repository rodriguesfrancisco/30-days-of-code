package com.company.thirtydaysofcode.datatypes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int secondInt;
        double secondDouble;
        String secondString;

        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        secondString = scan.nextLine();

        System.out.println(i + secondInt);
        System.out.println(String.format("%.2f", d + secondDouble));
        System.out.println(s + secondString);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
