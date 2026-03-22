package com.gla.methods.level3;

import java.util.*;

public class FactorUtility {

    public static int[] findFactors(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for(int f : factors) sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for(int f : factors) product *= f;
        return product;
    }

    public static double cubeProduct(int[] factors) {
        double product = 1;
        for(int f : factors) product *= Math.pow(f,3);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.print("Factors: ");
        for(int f : factors) System.out.print(f+" ");
        System.out.println();
        System.out.println("Greatest factor: "+greatestFactor(factors));
        System.out.println("Sum of factors: "+sumFactors(factors));
        System.out.println("Product of factors: "+productFactors(factors));
        System.out.println("Product of cube of factors: "+cubeProduct(factors));
    }
}