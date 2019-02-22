package com.company;

import java.util.Stack;

public class SimpleStack
{
    public static void main(String[] args)
    {
        SimpleStack simpleStack = new SimpleStack();
        simpleStack.run();
        simpleStack.peek();
    }

    private void peek()
    {
        Stack<String> myStack = new Stack<>();
        String peekAtStack = myStack.peek();
        System.out.println("Peek: " + peekAtStack);
    }

    private void run()
    {
        Stack<String> myStack = new Stack<>();

        //Add to Stack
        myStack.push("One");
        myStack.push("Two");
        myStack.push("Three");
        myStack.push("Four");
        myStack.push("Five");

        System.out.println("My Stack");
        System.out.println(myStack);
        System.out.println();

        //Pop off stack
       String popResult1 = myStack.pop();
        System.out.println("Pop: " + popResult1);
        System.out.println(myStack);
        System.out.println();

        String popResult2 = myStack.pop();
        System.out.println("Pop: " + popResult2);
        System.out.println(myStack);
        System.out.println();

        String popResult3 = myStack.pop();
        System.out.println("Pop: " + popResult3);
        System.out.println(myStack);
        System.out.println();

        String popResult4 = myStack.pop();
        System.out.println("Pop: " + popResult4);
        System.out.println(myStack);
        System.out.println();

        String popResult5 = myStack.pop();
        System.out.println("Pop: " + popResult5);
        System.out.println(myStack);
        System.out.println();

        //Six does not exist - creates EmptyStackException
        String popResult6 = myStack.pop();
        System.out.println("Pop: " + popResult6);
        System.out.println(myStack);
        System.out.println();

        String peeking = myStack.peek();
        System.out.println(peeking);
        System.out.println("Peeking: " + peeking);
        System.out.println(myStack);
        System.out.println("My Stack: "+ myStack);
    }
}