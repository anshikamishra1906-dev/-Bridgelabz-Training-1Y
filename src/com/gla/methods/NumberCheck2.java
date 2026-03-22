package com.gla.methods.level2;

import java.util.Scanner;

public class NumberCheck2 {

    public static boolean isPositive(int num) {

        if(num >= 0) {
            return true;
        }

        return false;
    }


    public static boolean isEven(int num) {

        if(num % 2 == 0) {
            return true;
        }

        return false;
    }


    public static int compare(int num1, int num2) {

        if(num1 > num2) {
            return 1;
        }

        else if(num1 == num2) {
            return 0;
        }

        else {
            return -1;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];


        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }


        System.out.println();


        for(int i = 0; i < arr.length; i++) {

            if(isPositive(arr[i])) {

                if(isEven(arr[i])) {

                    System.out.println(arr[i] + " is Positive and Even");
                }

                else {

                    System.out.println(arr[i] + " is Positive and Odd");
                }
            }

            else {

                System.out.println(arr[i] + " is Negative");
            }
        }


        int result = compare(arr[0], arr[arr.length - 1]);


        System.out.println();


        if(result == 1) {

            System.out.println("First number is greater than last number");
        }

        else if(result == 0) {

            System.out.println("First and last numbers are equal");
        }

        else {

            System.out.println("First number is less than last number");
        }
    }
}