package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{

    Queue<String> tasks = new LinkedList<>();

    public static void main(String[] args)
    {
        TaskHelper taskHelper = new TaskHelper();

        taskHelper.run();
    }

    private void run()
    {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        String userInput;
        String taskToAdd;

        printMenu();

        do
        {
            userInput = input.next();

            switch (userInput)
            {
                case "a":
                case "Add":
                    taskToAdd = input.nextLine();
                    add(taskToAdd);
                    break;
                case "p":
                case "Peek":
                    peek();
                    break;
                case "r":
                case "Remove":
                    remove();
                    break;
                case "h":
                case "HowMany":
                    howMany();
                    break;
                case "f":
                case "Flee":
                    flee();
                    break;
                case "e":
                case "Exit":
                    System.out.println("Exiting program.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
        while (running);
    }


    private void add(String task)
    {
        if (task.equals("") || task.equals(" ")) //Check for empty string or a single space
        {
            System.out.println("You didn't add anything");
        }
        else
        {
            tasks.add(task);
            System.out.println("Add(): " + task);
        }
    }

    private void peek()
    {
        String nextItem = tasks.peek();
        System.out.println("The next task is: " + nextItem);
    }

    private void remove()
    {
        String nextItem = tasks.peek();

        if (nextItem != null)
        {
            tasks.remove();
            peek();
            System.out.println("The item was removed");
        }
        else if(nextItem == null)
        {
            System.out.println("There is nothing in the list to remove.");
        }
    }

    private void howMany()
    {
        System.out.println(tasks.size() + " items left.");
    }

    private void flee()
    {
        tasks.clear();
        System.out.println("The list has been cleared.");
    }

    private void printMenu()
    {
        System.out.println("Type one of these things!");
        System.out.println("Add <Task Name>");
        System.out.println("Peek");
        System.out.println("Remove");
        System.out.println("HowMany");
        System.out.println("Flee");
        System.out.println("Exit");
    }

}
