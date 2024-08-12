package org.example;

public class E3Array2DEvenElements {

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 3, 5},
                {2, 7, 8},
                {3, 6, 10,300}

        };
        for (int c = 0; c < numbers.length; c++) {
            for (int r = 0; r < numbers[c].length; r++) {
                if (numbers[c][r] % 2 == 0) {

                    System.out.print(numbers[c][r]+" ");
                }
            }
        }
        System.out.println();

    }
}
