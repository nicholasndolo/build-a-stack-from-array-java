package com.buildStackFromArray;

public class Stack {
    private int[] items = new int[5];
    private int count;

    public void push(int item){
        if(count == items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

}
