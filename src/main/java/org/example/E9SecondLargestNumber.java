package org.example;

public class E9SecondLargestNumber {
    public static void main(String[] args) {
        int[] number = {3, 7, 10, 40, 67, -5};

        int largest =0;
        int secondLargest =0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            } else if (number[i] > secondLargest) {
                secondLargest = number[i];

            }
        }
            System.out.println("Second highest number is: " + secondLargest);
        }

    }


