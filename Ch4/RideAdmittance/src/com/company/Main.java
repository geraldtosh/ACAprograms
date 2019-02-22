package com.company;

public class Main
{
    public static void main(String[] args)

    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter height");
        int height = userInput.nextInt();

        if (height <= 36)
        {
            System.out.println("Issue RED band to customer");
        }

        if (height >= 37&& height <= 53)
        {
           System.out.println("Issue YELLOW band to customer");
        }

        if (height >= 54 && height <= 80)
        {
            System.out.println("Issue GREEN band to customer");
        }

        if (height > 80)
        {
            System.out.println("Issue NO band to the customer, they are too tall");
        }
    }
}

