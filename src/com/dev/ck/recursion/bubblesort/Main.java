package com.dev.ck.recursion.bubblesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int []arr = {4,2,7,1,3,1,6,9,1,4};
        new BubbleSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
