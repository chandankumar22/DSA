package com.dev.ck.recursion.sortstack;

import java.util.Stack;

public class SortStack {

    public void sortStack(Stack<Integer> stack){
        System.out.println(stack);
        sort(stack);
        System.out.println(stack);
    }

    public void sort(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        sort(stack);
        insert(stack,temp);
    }

    public void insert(Stack<Integer> stack, Integer num){
        if(stack.isEmpty() || stack.peek()<=num){
            stack.push(num);
            return;
        }
        Integer popped = stack.pop();
        insert(stack,num);
        stack.push(popped);
    }
}
