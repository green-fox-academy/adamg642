package com.example.helloworld;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int numToFigure = 42;
        Scanner reader = new Scanner(System.in);
        int guessedNum = reader.nextInt();
        while(numToFigure!= guessedNum){
            if (numToFigure< guessedNum){
                System.out.println("the stored number is lower");
        }
            else {
                System.out.println("the stored number is higher");
            }
            System.out.println("Guess again!");
            guessedNum = reader.nextInt();
        }
        System.out.println("You found the number: "+ numToFigure);

    }
}
