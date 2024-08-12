package org.example;

import java.util.Scanner;

public class E6FindPrimeoOrNot {
    public static void main(String[] args) {

        int num=13;
        boolean isPrime=true;


        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= num/ 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // If number is divisible by any number other than 1 and itself
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}
