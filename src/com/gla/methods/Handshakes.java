package com.gla.methods;

import java.util.Scanner;

public class Handshakes
{

    public static int calculateHandshakes(int n)
    {
        int handshakes = (n * (n - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int numberOfStudents = sc.nextInt();

        int result = calculateHandshakes(numberOfStudents);

        System.out.println();
        System.out.println("The number of possible handshakes is " + result);

    }

}