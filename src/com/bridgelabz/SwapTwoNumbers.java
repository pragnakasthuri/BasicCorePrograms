package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter A: ");
        int A = inputScanner.nextInt();  //taking first number from user

        System.out.println("Please enter B: ");
        int B = inputScanner.nextInt();   //taking second number from user
        //Logic for swapping two numbers
        B = A + B;
        A = B - A;
        B = B - A;

        System.out.println("The swapped numbers are : " +A+ "  " +B);
        inputScanner.close();  //closing the scanner object
    }
}
