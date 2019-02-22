package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Triangle myTriangle = new Triangle();

        myTriangle.sideA = 4;
        myTriangle.sideB = 4;
        myTriangle.sideC = 4;

        System.out.println(" Perimeter  : " + myTriangle.getPerimeter());

        myTriangle.sideA = 3;
        myTriangle.sideB = 5;
        myTriangle.sideC = 8;

        System.out.println(" Perimeter  : " + myTriangle.getPerimeter());

        printTriangleSummary(myTriangle);
    }

    private static void printTriangleSummary(Triangle myTriangle)
    {
        double perimeter = myTriangle.getPerimeter();

        System.out.println(" Perimeter from method = : " + perimeter);
        System.out.println("\n Side A : "+ myTriangle.sideA + " Side B : " + myTriangle.sideB + " Side C: " + myTriangle.sideC);

        if (myTriangle.sidesAreEqual = true)
        {
            System.out.println("\n Sides are equal");
        }
    }
}