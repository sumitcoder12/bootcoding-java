package com.bootcoding.java;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int temp = n;
        int rem = 0;
        while (n!=0){
            rem = rem * 10 + n % 10;
            n = n / 10;

        }
        if (temp == rem){
            System.out.println(temp + "is palindrom number");

        }else {
            System.out.println(temp + " is not palidrom number");
        }

    }
}
