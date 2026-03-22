package com.gla.methods;

import java.util.Scanner;

public class ChocolateDistribution
{

    public static int[] findRemainderAndQuotient(int number, int divisor)
    {

        int chocolatesEach = number / divisor;
        int remainingChocolates = number % divisor;

        return new int[]{chocolatesEach, remainingChocolates};

    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates : ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children : ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println();
        System.out.println("Each child gets " + result[0] + " chocolates");
        System.out.println("Remaining chocolates are " + result[1]);

    }

}