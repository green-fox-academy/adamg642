package com.example.helloworld;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner reader = new Scanner(System.in);
        String urName = reader.next();
        reader.close();
        System.out.println("Hello,"+urName+"!");
    }
}
