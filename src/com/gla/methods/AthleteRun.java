package com.gla.methods;

import java.util.Scanner;

public class AthleteRun
{

    public static double calculateRounds(double a, double b, double c)
    {
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;
        return rounds;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 : ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 : ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 : ");
        double side3 = sc.nextDouble();

        double result = calculateRounds(side1, side2, side3);

        System.out.println();
        System.out.println("Number of rounds to complete 5 km run is " + result);

    }

}