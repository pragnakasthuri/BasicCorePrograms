package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter a number :");
        int userInput = inputScanner.nextInt();  //Taking input from user
        inputScanner.close(); //closing the scanner object

        if((userInput%2) == 0) {  //checking weather the remainder is 0 or not
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }
}
