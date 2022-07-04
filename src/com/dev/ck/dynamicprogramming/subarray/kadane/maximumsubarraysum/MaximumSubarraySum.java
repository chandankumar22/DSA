package com.dev.ck.dynamicprogramming.subarray.kadane.maximumsubarraysum;


import java.util.Arrays;

/*
* Kadane's Algorithm : Medium
* Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
*
* Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
* Output: 6
* Explanation: [4,-1,2,1] has the largest sum = 6.
* GFG: https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
* Leetcode: https://leetcode.com/problems/maximum-subarray/
* */
public class MaximumSubarraySum {

    /*
    * The logic here is that whenever the running sum over the array at any ith position becomes negative, we simply do not
    * add that sum to the current ith processing element for the array (as adding negative will obviously decrease the sum).
    * We assign a new running sum ,i.e. the current ith processing  element and starts a new/fresh subarray sum from this position.
    *  Whenever we encounter a running sum being greater than the current maximum, we update that maximum.
    * */
    public static int findMaximumSubarraySum(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        int max = arr[0];
        int runningSum = arr[0];

        for (int i=1;i<n;i++) {
            if(runningSum>0){
                runningSum+=arr[i];
            } else runningSum=arr[i];
            max = Math.max(runningSum,max);
        }
        System.out.println("Maximum subarray sum is " + max);
        return max;
    }

    public static void printSubarrayWithMaximumSum(int[] arr) {
        int n = arr.length;
        if(n==0) return;
        int []maxSubArray = new int[n];
        int runningSum = arr[0];
        maxSubArray[0] = arr[0];
        for(int i=1;i<n;i++){
            if(runningSum>0){
                runningSum+=arr[i];
            }else runningSum = arr[i];
            maxSubArray[i] = runningSum;
        }
        int max = Arrays.stream(maxSubArray).max().getAsInt();
        System.out.println("Maximum subarray sum is " + max);
        int index = n-1;
        while(maxSubArray[index]!=max){
            index--;
        }
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(maxSubArray));
        for(int i=index;max!=0;i--){
            System.out.print(" "+arr[i]+",");
            max-=arr[i];
        }
    }
}
