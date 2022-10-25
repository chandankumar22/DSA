package com.dev.ck.recursion.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []arr = {1,5,2,2,6,9,1,6,2,7,9,3,2,5,1};
        arr = (new MergeSort()).sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
