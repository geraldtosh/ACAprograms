package com.company;

import java.util.HashSet;

public class SimpleSet

{
    public static void main(String[] args)
    {
        SimpleSet simpleSet = new SimpleSet();
        simpleSet.run();

    }

    private void run()
    {
        HashSet<Integer> mySet = new HashSet<>();

        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.add(3);

        System.out.println(mySet);

        System.out.println("add 3 again " + mySet);

    }
}
