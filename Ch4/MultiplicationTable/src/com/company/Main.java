//!! Looking at Louis's code he posted on github in order to understand; NOT my code:
package com.company;

public class Main
{
    public static void main(String[] args)
    {
        final String NUMBER_FORMAT = "%5d";

        //Get the max number from the user
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int max = input.nextInt();

        //Print the column headers
        System.out.print("         ");
        int headerColumnCount = 1;
        while (headerColumnCount <= max)
        {
            System.out.printf(NUMBER_FORMAT, headerColumnCount);
            headerColumnCount = headerColumnCount + 1;
        }
        System.out.println();

        //Print the row of dashes below the column headers
        System.out.print("        -");
        headerColumnCount = 1;
        while (headerColumnCount <= max)
        {
            System.out.print("-----");
            headerColumnCount = headerColumnCount + 1;
        }
        System.out.println();

        //Print each row
        int rowCount = 1;
        while (rowCount <= max)
        {
            //Print the row header
            int columnCount = 1;
            System.out.printf(NUMBER_FORMAT + "   |", rowCount);

            //Print each columns
            while (columnCount <= max)
            {
                int answer = rowCount * columnCount;
                System.out.printf(NUMBER_FORMAT, answer);
                columnCount = columnCount + 1;
            }

            //Drop cursor down for next row
            System.out.println();

            rowCount = rowCount + 1;
        }
    }
}

/*package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a whole number; I will build a multiplication table to that number:");

        int maxNumber = userInput.nextInt();
        int counter = 0;

        while (counter != maxNumber)
        {
            int product = maxNumber * counter;
            System.out.printf("\n      1     2     3     4     5");
            System.out.printf("\n      -------------------------");
            System.out.printf("\n1     1     2     3     4     53     4     5");

            //System.out.printf("\n%1d   %1d   %1d%n", 1,2,3,4,5);
            //System.out.printf(maxNumber + "  X %2d = %3d%n", counter, product);
            counter = counter + 1;
        }
    }
}
*/