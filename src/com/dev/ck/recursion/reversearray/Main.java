package com.dev.ck.recursion.reversearray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};

        new ReverseArray().reverse(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
