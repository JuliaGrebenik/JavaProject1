package org.example;

public class E1Temperature {
    public static void main(String[] args) {

        int[] temperatures = {70, 86, 89, 101, 98, 100, 85};

        int lowest = temperatures[0];
        int highest = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {

            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
        }

                System.out.println("The lowest temperature is: " + lowest);
                System.out.println("The highest temperature is " + highest);
        }
    }



