package com.example.helloworld;
import java.util.Scanner;
public class WriteTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //        //
        //        // *
        //        // **
        //        // ***
        //        // ****
        //        //
        //        // The triangle should have as many lines as the number was

        Scanner reader = new Scanner(System.in);
        int inputNum = reader.nextInt();
        reader.close();
        for (int i=0; i<=inputNum; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
