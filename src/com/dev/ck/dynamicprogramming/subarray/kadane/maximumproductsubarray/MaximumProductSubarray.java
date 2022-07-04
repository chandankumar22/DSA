package com.dev.ck.dynamicprogramming.subarray.kadane.maximumproductsubarray;


/*
* Kadane's Algorithm : Maximum Product Subarray
*
* Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
* The test cases are generated so that the answer will fit in a 32-bit integer.
* A subarray is a contiguous subsequence of the array.
*
* Input: nums = [2,3,-2,4]
* Output: 6
* Explanation: [2,3] has the largest product 6.
*
* GFG: https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1/
* Leetcode: https://leetcode.com/problems/maximum-product-subarray/
* */
public class MaximumProductSubarray {

    /**
     * The logic here is same as the maximum subarray sum. In subarray sum, we were starting fresh whenever we encounter the negative
     * running sum as ultimately negative running sum when added to current element, will obviously decrease the sum.
     *
     * In this problem also we are maintaining the running max product for every element in array, but there may be a case when a
     * negative product multiplies with the current ith negative element and that may give us the maximum product. So we need to keep record
     * for the maximum negative as well as the maximum positive product at every ith element. Then out of all, the maximum of these
     * two will be the answer.
     * */
    public static long findMaximumSubarrayProduct(int[] arr) {
        int n = arr.length;
        if(n==0) return 0;

        long runningMax = arr[0];
        long runningMin = arr[0];
        long ans = arr[0];

        for(int i=1;i<n;i++){
            long num = arr[i];
            if(num==0) runningMax=runningMin=0;
            else{
                long currMaxProd = runningMax*num;
                long currMinProd = runningMin*num;
                runningMax = Math.max(num,Math.max(currMaxProd,currMinProd));
                runningMin = Math.min(num,Math.min(currMaxProd,currMinProd));
            }
            ans = Math.max(ans, runningMax);

        }

        return ans;
    }
}
