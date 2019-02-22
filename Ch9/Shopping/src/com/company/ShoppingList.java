package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList
{
    private ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args)
    {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.run();
    }

    private void run()
    {
        this.list.add("Test1");
        this.list.add("Test2");
        this.list.add("Test3");
        this.list.add("Test4");
        this.list.add("Test5");

        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;

        do
        {
            System.out.println("Enter a command:");
            String command = input.next();

            switch(command)
            {
                case "Add":
                case "A":
                    String item = input.next();
                    add(item);
                    break;
                case "Remove":
                case "R":
                    int index = input.nextInt();
                    remove(index);
                    break;
                case "Print":
                case "P":
                    print();
                    break;
                case "Clear":
                case "C":
                    clear();
                    break;
                case "Exit":
                case "E":
                    System.out.println("!Exit");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Please try again.");
            }
        }
        while (keepRunning);

        System.out.println("Goodbye!");

    }

    private void add(String item)
    {
        System.out.println("!Add " + item);
        this.list.add(item);
    }

    private void remove(int index)
    {
        this.list.remove(index);
    }

    private void print()
    {
        int index = 0;

        for (String item:this.list)
        {
            System.out.println(index + " : " + item);
            index++;
        }
    }

    private void clear()
    {
        this.list.clear();
        System.out.println("List cleared");
    }
}