package org.example;

public class E4Sum2DArrayNumbers {

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 3, 5},
                {2, 7, 8},
                {3, 6, 10,15}

        };
        int sum=0;
        for(int c=0; c<numbers.length; c++){
            for(int r=0; r<numbers[c].length;r++) {
                sum += numbers[c][r];
            }
        }
        System.out.println("The sum of numbers is: " + sum);
    }
}
