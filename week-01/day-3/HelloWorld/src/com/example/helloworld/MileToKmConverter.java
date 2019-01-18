package com.example.helloworld;

import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner reader = new Scanner(System.in);
        int kmDist = reader.nextInt();
        reader.close();
        float change = 0.62f;
        float fin ;
        fin = kmDist*change;
        System.out.println(fin);
    }
}
