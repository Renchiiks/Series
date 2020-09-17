package com.example.mypackage;

public class Series {
    public static int nSum(int n) {
        int sum = n;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (long i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;

    }

    public static int fibonacci(int n) {

        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
