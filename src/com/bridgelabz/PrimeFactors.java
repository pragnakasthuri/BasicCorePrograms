package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        // Take inputs from user
        int num1 = inputScanner.nextInt();

        for(int i=2; i<num1; i++) {
            if (num1%i == 0) { // finding factors for given number
                int cnt = 0;
                for (int j=1; j<=i; j++) {
                    if (i%j == 0) { // finding factor is prime or not
                        cnt++;
                    }
                }
                if (cnt == 2) {
                    System.out.println(i); // printing prime factor
                }
            }
        }
    }
}
