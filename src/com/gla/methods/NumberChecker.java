package com.gla.methods.level3;

import java.util.*;

public class NumberChecker {

    public static int countDigits(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n, int size) {
        int[] digits = new int[size];
        for(int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for(int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for(int d : digits) sum += Math.pow(d,2);
        return sum;
    }

    public static boolean isHarshad(int n,int[] digits) {
        int sum = sumOfDigits(digits);
        return n % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for(int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for(int d : digits) freq[d][1]++;
        return freq;
    }

    public static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for(int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] a,int[] b) {
        if(a.length != b.length) return false;
        for(int i = 0; i < a.length; i++) if(a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] rev = reverseArray(digits);
        return compareArrays(digits,rev);
    }

    public static boolean isDuckNumber(int[] digits) {
        for(int d : digits) if(d == 0) return true;
        return false;
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= n/2; i++) if(n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n*n;
        int sum = 0;
        while(square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1, temp = n;
        while(temp != 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n*n;
        int temp = n;
        while(temp != 0) {
            if(temp % 10 != square % 10) return false;
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static int sumOfProperDivisors(int n) {
        int sum = 0;
        for(int i = 1; i <= n/2; i++) if(n % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumOfProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumOfProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumOfProperDivisors(n) < n;
    }

    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while(temp != 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    public static void findLargestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int d : digits) {
            if(d > largest) {
                second = largest;
                largest = d;
            } else if(d > second && d != largest) second = d;
        }
        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+second);
    }

    public static void findSmallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int d : digits) {
            if(d < smallest) {
                second = smallest;
                smallest = d;
            } else if(d < second && d != smallest) second = d;
        }
        System.out.println("Smallest digit: "+smallest);
        System.out.println("Second smallest digit: "+second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int count = countDigits(num);
        int[] digits = storeDigits(num,count);
        System.out.println("Digits count: "+count);
        System.out.println("Sum of digits: "+sumOfDigits(digits));
        System.out.println("Sum of squares: "+sumOfSquares(digits));
        System.out.println("Harshad: "+isHarshad(num,digits));
        System.out.println("Palindrome: "+isPalindrome(digits));
        System.out.println("Duck number: "+isDuckNumber(digits));
        System.out.println("Prime: "+isPrime(num));
        System.out.println("Neon: "+isNeon(num));
        System.out.println("Spy: "+isSpy(num));
        System.out.println("Automorphic: "+isAutomorphic(num));
        System.out.println("Buzz: "+isBuzz(num));
        System.out.println("Perfect: "+isPerfect(num));
        System.out.println("Abundant: "+isAbundant(num));
        System.out.println("Deficient: "+isDeficient(num));
        System.out.println("Strong: "+isStrong(num));
        findLargestSecondLargest(digits);
        findSmallestSecondSmallest(digits);
        int[][] freq = digitFrequency(digits);
        for(int i = 0; i < freq.length; i++) if(freq[i][1] > 0) System.out.println("Digit "+freq[i][0]+" Frequency "+freq[i][1]);
    }
}