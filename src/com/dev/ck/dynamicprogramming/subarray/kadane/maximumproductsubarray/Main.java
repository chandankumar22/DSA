package com.dev.ck.dynamicprogramming.subarray.kadane.maximumproductsubarray;

public class Main {

    public static void main(String[] args) {
        int []arr =  {-2,0,-1};
//        int []arr = {3 ,12 ,15 ,23 ,33 ,-35 ,30 ,-40 ,-30 ,-30 ,-30 ,26 ,28};
        MaximumProductSubarray.findMaximumSubarrayProduct(arr);
        //MaximumProductSubarray.printSubarrayWithMaximumSum(arr);
    }
}
