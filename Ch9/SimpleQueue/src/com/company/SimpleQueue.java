package com.company;

import java.util.LinkedList;
import java.util.Queue;


public class SimpleQueue
{
    public static void main(String[] args)
    {
        SimpleQueue squeue = new SimpleQueue();
        squeue.run();

    }

    private void run()
    {
        Queue<String> myQueue = new LinkedList();

        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");
        String peeking = myQueue.peek();
        System.out.println(peeking);
        System.out.println(myQueue);

        //remove
        myQueue.remove("poll");
        System.out.println(myQueue);

    }
}
