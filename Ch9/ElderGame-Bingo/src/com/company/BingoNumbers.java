package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class BingoNumbers
{
    HashSet<Integer> mySet = new HashSet<>();

    public static void main(String[] args)
    {
        BingoNumbers bNumbers = new BingoNumbers();
        bNumbers.run();
    }

    private void run()
    {
       Scanner input = new Scanner(System.in);

        boolean keepRunning = true;

        System.out.println("Enter one of the following commands: ");
        System.out.println("Call, Called, Verify, Challenge, Bingo, Exit");

        do
        {
            String command = input.next();

            switch (command)
            {
                case "Call":
                case "c":
                    Integer numberToCall = input.nextInt();
                    call(numberToCall);
                    break;

                    case "Called":
                    called();
                    break;

                case "Verify":
                case "v":
                    Integer numberToVerify = input.nextInt();
                    System.out.println(mySet);
                    verify(numberToVerify);
                    break;

                case "Challenge":
                case "ch":
                    Integer numberToChallenge = input.nextInt();
                    System.out.println(mySet);
                    challenge(numberToChallenge);
                    break;

                case "Bingo":
                case "b":
                    bingo();
                    break;

                case "Exit":
                     keepRunning = false;
                    System.out.println("Program Exited");
                     break;

                     default:
                     System.out.println("Invalid Entry, check default");
            }
        }
        while (keepRunning) ;
    }
     private void call(Integer numberToCall)
     {
         if (numberToCall < 1 || numberToCall > 75)

         {
             System.out.println("Invalid number");
         }

         else if (mySet.contains(numberToCall))
             {
                 System.out.println("Already Called");
             }
        else
         {
             mySet.add(numberToCall);
             System.out.println("MySet: " + mySet);
             System.out.println("Added " + numberToCall);
         }

     }

    private void called()
    {
        System.out.println(mySet);
    }

    private void verify(Integer numberToVerify)
    {

        if (mySet.contains(numberToVerify))
        {
            System.out.println("The set contains the number" + numberToVerify);
        }
        else
        {
            System.out.println("The set does not contain : " + numberToVerify);
        }

    }

    private void challenge(Integer numberToChallenge)
    {
        if (numberToChallenge < 1 || numberToChallenge > 75)

        {
            System.out.println("Invalid number");
        }

        else if (mySet.contains(numberToChallenge))
        {
            mySet.remove(numberToChallenge);
            System.out.println("Removed: " + numberToChallenge);
            System.out.println("My Set: " + mySet);
        }

        else
        {
            System.out.println("Number not in set");
        }
    }

    private void bingo()
    {
        if (mySet.size() >= 4)
        {
            System.out.println("Congratulations you win a fruit cake!");
            mySet.clear();
            System.out.println(mySet.size());
        }
        else
        {
            System.out.println("Cheater!");
        }
    }
}


