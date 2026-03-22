package com.gla.methods.level2;

import java.util.Scanner;

public class SumNaturalRecursive
{

    public static int recursiveSum(int n)
    {

        if(n == 1)
            return 1;

        return n + recursiveSum(n - 1);

    }

    public static int formulaSum(int n)
    {

        return n * (n + 1) / 2;

    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Please enter a natural number");
            return;
        }

        int sumByRecursion = recursiveSum(n);
        int sumByFormula = formulaSum(n);

        System.out.println();
        System.out.println("Sum using recursion = " + sumByRecursion);
        System.out.println("Sum using formula = " + sumByFormula);

        if(sumByRecursion == sumByFormula)
            System.out.println("Both computations are correct and equal");
        else
            System.out.println("Results are not equal");

    }

}