package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int userInput = inputScanner.nextInt();  //Taking the user input
        while (true) {
            if (userInput >= 0 && userInput < 31) {  //condition to check weather the given number is valid
                System.out.println("Valid number ");
                inputScanner.close(); //closing scanner object
                break;
            } else {
                System.out.println("Please enter a valid number :");
                userInput = inputScanner.nextInt();
            }
        }

        for (int i = 1; i <= userInput; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow((2), i));
        }
        int result = (int) Math.pow((2), userInput);
        System.out.println(result);
        if (result % 4 == 0 && result % 400 == 0) {    //Leap Year condition
            System.out.println("The result is a leap year");
        } else {
            System.out.println("The result is not a leap year");
        }
    }
}


