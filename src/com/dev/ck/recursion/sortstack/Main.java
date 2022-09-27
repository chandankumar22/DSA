package com.dev.ck.recursion.sortstack;

import com.dev.ck.recursion.sortarray.SortArray;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(3);
        nums.push(4);
        new SortStack().sortStack(nums);
    }
}
