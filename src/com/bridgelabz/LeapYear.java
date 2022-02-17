package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner leapYear = new Scanner(System.in);
        System.out.println("Please enter a year : ");
        int validYear = leapYear.nextInt();   //Taking user input and storing in validYear
        while (true) {   //while condition to check the given year is valid
            if (validYear > 999 && validYear <= 9999) {
                System.out.println("valid year");
                break;
            } else {
                System.out.println("Please enter a valid 4 digit number :");
                validYear = leapYear.nextInt();
            }
        }
        leapYear.close();   //closing the scanner object
        if (validYear % 4 == 0) {   //if Year mod 4 gives remainder 0
            System.out.println("The entered number is a leap year");
        } else {
            System.out.println("The entered number is not a leap year");
        }
    }
}

