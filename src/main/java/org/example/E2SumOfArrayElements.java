package org.example;

public class E2SumOfArrayElements {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of elements is: "+sum);
    }
}
