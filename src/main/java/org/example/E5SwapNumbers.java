package org.example;

public class E5SwapNumbers {

    public static void main(String[] args) {
        int a=1;
        int b=2;

        a=a+b; //1+2=3
        b=a-b; //3-2=1
        a=a-b; //3-1=2

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
