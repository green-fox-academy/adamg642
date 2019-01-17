package com.example.helloworld;

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int x = 123;
        int y = 526;
        x = x ^ y ^ (y = x);

        System.out.println(x);
        System.out.println(y);
    }
}
