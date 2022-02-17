package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = inputScanner.nextInt(); //storing the given user input in userInput of int type
        while (userInput <= 0) {  //To check weather the given number is valid
            System.out.println("Please enter a valid number :");
            userInput = inputScanner.nextInt();
            inputScanner.close();   //closing the scanner object
        }
        double result = 0.0;
        for(int i=1; i<=userInput; i++) {
            result+=((double)1/i);
        }
        System.out.println("Harmonic number for given number is: "+result);
    }
}
