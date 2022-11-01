package com.dev.ck.recursion.sumtriangleofarray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long []arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(new SumTriangle().getTriangle(arr,arr.length)));
    }
}
