package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
        public static void main(String[] args) {
            boolean isVowel=false;
            Scanner inputScanner=new Scanner(System.in);

            System.out.println("Enter a character : ");
            char ch=inputScanner.next().charAt(0);  //taking the input from user as character
            inputScanner.close();    //closing the scanner object
            switch(ch)
            {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' : isVowel = true;
            }
            if(isVowel == true) {   //checking for vowel
                System.out.println(ch+" is a Vowel");
            } else {                //checking for consonant
                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                    System.out.println(ch+" is a Consonant");
                else
                    System.out.println("Input is not an alphabet");
            }
        }
    }




