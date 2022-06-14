package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        fibonaci(10);

        //boolean prime = isPrime(11);
        //boolean polidrome = isPolidrome("caba");
        //System.out.println(polidrome);
        //int test = 3554;

        //System.out.println(test /= 10);

        //boolean b = armstrongNumber(1532);
        //System.out.println(b);

//        String test = "abcdefg";
//        String test2 = "acdebfg";
//
//        char[] test3 = test.toCharArray();
//        char[] test4 = test2.toCharArray();
//
//        Arrays.sort(test3);
//        Arrays.sort(test4);
//
//        boolean equals = Arrays.equals(test3, test4);
//
//        System.out.println(equals);


        int x = 10;
        int y = 2;

        x = x + y;
        y = x - y;
        x = x - y;

    }

    private static void fibonaci (int target) {

        int num1 =0;
        int num2 = 1;
        int counter = 0;

        while(counter < target) {

            System.out.println(num1);

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }


    }

    private static boolean isPrime(int target) {

        if(target <= 1) return false;
        if(target == 2) return true;
        if((target % 2) == 0 ) return false;

        int start = 3;

        while(start <= target/2) {

            if((target % start) == 0) return false;

            start++;

        }

        return true;
    }

    private static boolean isPolidrome(String target) {

        StringBuilder stringBuilder = new StringBuilder(target);
        String reverse = stringBuilder.reverse().toString();

        if(reverse.equals(target)) return true;

        return false;
    }


    private static boolean armstrongNumber(int target) {

        int temp = target;
        int sum =0;
        int r;

        while(target != 0) {

            r = target%10;
            target /= 10;
            sum = sum + r*r*r;

        }

        if(sum == temp) return true;

        return false;
    }
}
