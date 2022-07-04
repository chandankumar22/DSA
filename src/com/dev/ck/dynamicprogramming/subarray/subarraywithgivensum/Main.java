package com.dev.ck.dynamicprogramming.subarray.subarraywithgivensum;

public class Main {

    public static void main(String[] args) {
        int []arr = {1,2,3,7,5};
        int sum=12;
        System.out.println(SubarrayWithGivenSum.findSubarrayWithGivenSum(arr,sum));
    }
}
