package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a whole number:");

        int enteredNumber = userInput.nextInt();
        int counter = 1;

        while (counter <= 10)
        {
            int product = enteredNumber * counter;
            System.out.printf(enteredNumber + "  X %2d = %3d%n", counter, product);
            counter = counter + 1;
        }
    }
}