package org.example;

public class E8MaximumAndMinimumNumberInTheArray {
    public static void main(String[] args) {
        int []number={-5,3,5,7,9,30};

        int maxNum=number[0];
        int minNum=number[0];

        for(int i=0; i<number.length; i++){
            if(number[i]>maxNum){
                maxNum=number[i];
            }
            if(number[i]<minNum){
                minNum=number[i];
            }
        }
        System.out.println("The maxiumum number is: "+maxNum);
        System.out.println("The minimum number is: "+minNum);


    }
}
