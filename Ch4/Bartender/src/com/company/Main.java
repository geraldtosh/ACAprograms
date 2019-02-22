package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("  \n  Drink Menu \n    ");
        System.out.println("  1. Water         ");
        System.out.println("  2. Cola          ");
        System.out.println("  3. Glen Rio Ale  ");

        System.out.println("\nPlease select your drink    ");
        int drinkNumber = userInput.nextInt();

        if (drinkNumber == 1)
        {
            System.out.println("Here is your water");
        }

        if (drinkNumber == 2)
        {
            System.out.println("Here is your cola");
        }

        if (drinkNumber == 3)
        {
            System.out.println("Please enter your Age");
            int age = userInput.nextInt();
            int legalAge = 21;
            int yearsComeBack = (legalAge - age);
            if (age >= 21)
            {
                System.out.println("Hear is your Ale");
            }
            else
            {
                if (age == 20)
                    System.out.println("No drink for you! Come back in "+ yearsComeBack + " year");
                else
                    System.out.println("No drink for you! Come back in "+ yearsComeBack + " years");
            }
        }

    }

}

