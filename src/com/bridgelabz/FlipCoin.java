// program to Flip Coin and print percentage of Heads and Tails

package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        int heads = 0, tails = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the number of times to flip coin");
        int flipCnt = inputScanner.nextInt();           //The user input is storing in flipCnt
        Random r = new Random();                        //creating random object
        inputScanner.close();                           //close the scanner class
        for (int i = 1; i <= flipCnt; i++) {
            float coinSide = r.nextFloat();             //taking coin side as float
            if (coinSide < 0.5) {
                tails++;    //incrementing tails
            } else {
                heads++;    //incrementing heads
            }
        }
        System.out.println("No.of heads: "+heads+", Heads Percentage :" + ((heads * 100)/flipCnt)+"%");   //printing heads percentage
        System.out.println("No.of tails: "+tails+", Tails Percentage :" + ((tails * 100)/flipCnt)+"%");   //printing tails percentage

    }
}

