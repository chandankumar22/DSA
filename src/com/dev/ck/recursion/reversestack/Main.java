package com.dev.ck.recursion.reversestack;

import com.dev.ck.recursion.sortstack.SortStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(6);
        nums.push(4);
        new ReverseStack().reverseStack(nums);
    }
}
