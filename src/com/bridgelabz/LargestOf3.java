package com.bridgelabz;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        // Take inputs from user
        int num1 = inputScanner.nextInt();
        int num2 = inputScanner.nextInt();
        int num3 = inputScanner.nextInt();
        int max = 0; // temp variable
        if (num1 > num2 && num1 > num3) {
            max = num1; // if num1 is bigger than other two store it into max
        } else if (num2 > num3) {
            max = num2; // as num1 is not big, check for num2
        } else {
            max = num3; // as num1 and num2 are evaluated as not big, num3 will be max
        }

        System.out.println("Max of given three numbers: "+max); //print
    }
}
