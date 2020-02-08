package com.company;

import java.util.Scanner;

public class Main {

    private static long lcm_naive(int a, int b) {
        return (long) a * b;
    }

    private static long euclid_gcd(long a, long b) {
        long divisor = a >= b ? a : b;
        long dividend = a <= b ? a : b;
        while (divisor != 0) {
            long remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }

    private static long lmc_fast(long a, long b) {
        return (a * b) / euclid_gcd(a, b);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm_naive(a, b));
        System.out.println(lmc_fast(a, b));
    }
}