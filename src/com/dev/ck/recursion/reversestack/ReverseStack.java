package com.dev.ck.recursion.reversestack;

import java.util.Stack;

public class ReverseStack {

    public void reverseStack(Stack<Integer> stack){
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);

    }

    public void reverse(Stack<Integer> stack){
        System.out.println(stack);
        if(stack.isEmpty()){
            return;
        }
        int number = stack.pop();
        reverse(stack);
        insert(stack,number);
    }

    public void insert(Stack<Integer> stack, Integer num){
        System.out.println(stack);
        if(stack.isEmpty()){
            stack.push(num);
            return;
        }
        Integer temp = stack.pop();
        insert(stack,num);
        stack.push(temp);
    }
}
