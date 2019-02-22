package com.company;

import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter a whole number: ");

        int withdrawal = 2;

        int fives = withdrawal / 5;
        int ones = withdrawal % 5;

        //System.out.println(+ fives);
        //System.out.println(+ ones);

        System.out.println("$5" + "(" + fives + "), $1(" + ones + ")");
    }
}
