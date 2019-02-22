package com.company;

public class Triangle
{
    int sideA;
    int sideB;
    int sideC;

    double perimeter = 0;

    boolean sidesAreEqual = false;

    public double getPerimeter()
    {
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    public boolean isEquilateral()
    {
        perimeter = sideA + sideB + sideC;

        if (sideA == sideB && sideB == sideC)
        {
            sidesAreEqual = true;
        }
        return sidesAreEqual;
    }
}
