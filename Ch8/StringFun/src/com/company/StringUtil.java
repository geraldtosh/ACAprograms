package com.company;

public class StringUtil
{
    public static String getFirstCharacter(String str)

    {
        String firstCharacter = str.substring(0, 1);

        return firstCharacter;
    }

    public static String getLastCharacter(String str)

    {
        String lastCharacter = str.substring(str.length() - 1);

        return lastCharacter;
    }

    public static String getFirstTwoCharacters(String str)

    {
        String firstTwoCharacters = str.substring(0, 2);

        return firstTwoCharacters;
    }

    public static String getLastTwoCharacters(String str)

    {
        String lastTwoCharacters = str.substring(str.length() - 2);

        return lastTwoCharacters;
    }


    public static String getAllButFirstThreeCharacters(String str)

    {
        String allButFirstThree = str.substring(+3);
        return allButFirstThree;
    }

    public static String getEveryOtherCharacter(String str)

    {
        String answer = "";

        int index = 0;

        while (index < str.length())
        {
            answer = answer + str.substring(index, index +1 );
            System.out.println("index = " + index + " answer = " + answer);
            index = index + 2;
        }
        return answer;
    }


   public static void printCharacters(String str)
   {
       int index = 0;

      //Hello indexes are 0,1,2,3,4 and length 5

       System.out.println();
       while (index < str.length())

       {
           System.out.println(str.charAt(index) + ":" + index);
           index = index + 1;
       }
   }

    public static String printPhoneNumber(String phoneNumber)
    {
        String areaCode;
        String exchange;
        String lineNumber;

        areaCode = phoneNumber.substring(0,3);
        exchange = phoneNumber.substring(4, 7);
        lineNumber = phoneNumber.substring(8, 12);

        System.out.println("\nArea Code: " + areaCode);
        System.out.println("Exchange: " + exchange);
        System.out.println("Line Number: " + lineNumber);

        System.out.println();

        return areaCode;
    }

    //8-B-10
    public static int findFirstE(String str)

    {
        int indexOfE = str.indexOf("e");

        return indexOfE;
    }

    public static boolean isFinn (String str)

    {
        boolean isFinn = str.equals("Finn");

           //else is by default

        return isFinn;
    }
}













