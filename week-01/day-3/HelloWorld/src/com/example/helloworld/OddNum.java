package com.example.helloworld;

import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        reader.close();
        if (number%2>0){
            System.out.println("Odd number");
        }
        else {
            System.out.println("Even number");
        }
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

    }
}
