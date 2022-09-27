package com.dev.ck.recursion.deletemidelementinstack;

import java.util.Stack;

public class DeleteMiddleElementFromStack {

    public void deleteMiddleElementFromStack(Stack<Integer> stack){
        System.out.println(stack);
        int mid = stack.size()/2;
        delete(stack,stack.size()-1,mid);
        System.out.println(stack);
    }

    public void delete(Stack<Integer> stack, int current, int mid){
        if(current == mid){
            stack.pop();
            return;
        }
        int element = stack.pop();
        delete(stack,current-1,mid);
        stack.push(element);
    }
}
