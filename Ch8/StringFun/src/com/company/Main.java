package com.company;

import static com.company.StringUtil.*;

public class Main
{

    public static void main(String[] args)
    {
        //Get first character
        System.out.println("First Character is " + getFirstCharacter  ("Hello"));
        System.out.println("First Character is " + getFirstCharacter  ("Goodbye"));

        //Get last character
        System.out.println("First two characters" + getLastCharacter  ("Hello"));
        System.out.println("First two characters " + getLastCharacter  ("Goodbye"));


        //Get Last Characters
        System.out.println("First two characters " + getFirstTwoCharacters  ("Hello"));
        System.out.println("First two characters " + getFirstTwoCharacters  ("Goodbye"));


        //Get last two characters
        System.out.println("Last two characters " + getLastTwoCharacters  ("Hello"));
        System.out.println("Last two characters " + getLastTwoCharacters  ("Goodbye"));

        //Get All But First Three Characters
        System.out.println("All but first three " + getAllButFirstThreeCharacters ("Hello"));
        System.out.println("All but first three " + getAllButFirstThreeCharacters ("Goodbye"));


        // Get Every Other Character
        System.out.println("FirstCharacter is " + getFirstCharacter("Hello"));
        System.out.println("First Character is " + getFirstCharacter("Goodbye"));
        System.out.println("Every other character " + getEveryOtherCharacter ("SEEKCARWEST"));

       //Print Characters

        printCharacters("Hello");


        //PrintPhoneNumber
        System.out.println("\nPhone Number = 501-555-0100: " + printPhoneNumber("501-555-0100"));


        //Find First E
        System.out.println("\nFirst E " + findFirstE( "goodbye"));


        //isFinn
       System.out.println("isFinn ? " + isFinn("Finn"));

    }
}
