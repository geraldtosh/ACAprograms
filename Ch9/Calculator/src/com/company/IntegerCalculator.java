package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class IntegerCalculator
{
    private long answer;
    private ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args)
    {
        IntegerCalculator calc = new IntegerCalculator();
        calc.run();
    }

    private void run()
    {
        System.out.println("Welcome to the Calculator");

        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;

        do
        {
            System.out.println("Enter your command:");
            String command = input.next();

            switch (command)
            {
                case "a":
                case "A":
                case "Add":
                    long addNumber = input.nextLong();
                    add(addNumber);
                    displayAnswer();
                    break;

                case "s":
                case "S":
                case "Subtract":
                    long subNumber = input.nextLong();
                    subtract(subNumber);
                    displayAnswer();
                    break;

                case "h":
                case "H":
                case "History":
                    displayHistory();

                    case "m":
                case "M":
                case "Multiply":
                    long mulNumber = input.nextLong();
                    multiply(mulNumber);
                    displayAnswer();
                    break;

                case "d":
                case "D":
                case "Divide":
                    long divNumber = input.nextLong();
                    divide(divNumber);
                    displayAnswer();
                    break;

                case "c":
                case "C":
                case "Clear":
                    clear();
                break;

                case "e":
                case "E":
                case "Exit":
                    keepRunning = false;
                    break;

                default:
                    System.out.println("Invalid Response");
                    break;
            }
        }
        while (keepRunning);

        System.out.println("Thank you for using Calculator 2100");
    }

    private void add(long number)
    {
        this.answer += number;
        history.add("Add " + number);
    }

    private void subtract(long number)
    {
        this.answer -= number;
        history.add("Subtract " + number);
    }

    private void multiply(long number)
    {
        this.answer *= number;
        history.add("Multiply " + number);
    }

    private void divide(long number)
    {
        this.answer /= number;
        history.add("Divide " + number);
    }

    private void clear()
    {
       this.answer = 0;
       history.add("Clear, 0");
    }

    private void displayAnswer()
    {
        System.out.println("The current answer is: " + this.answer);
    }

    private void displayHistory()
    {
        for (String action: history)
        {
            System.out.println(action);
        }
    }
}


























