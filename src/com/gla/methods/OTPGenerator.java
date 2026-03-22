package com.gla.methods.level3;

import java.util.*;

public class OTPGenerator {

    public static int generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }

    public static boolean checkUnique(int[] otpArray) {
        for(int i = 0; i < otpArray.length; i++) {
            for(int j = i + 1; j < otpArray.length; j++) {
                if(otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for(int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for(int otp : otpArray) {
            System.out.println(otp);
        }

        if(checkUnique(otpArray)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("Some OTPs are same");
        }
    }
}