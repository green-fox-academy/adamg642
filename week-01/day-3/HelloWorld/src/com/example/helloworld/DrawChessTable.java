package com.example.helloworld;

public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
        int n = 8;

        for(int i =0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if( (i+j) % 2 == 0){
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
