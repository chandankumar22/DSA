package com.dev.ck.patterns.cyclicsort;


/**
 * <a href="https://leetcode.com/problems/missing-number/">...</a>
 * <p>
 * Easy 268. Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * <p>
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */
class MissingNumber {

    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        
        int i = 0;
        while(i < arr.length){
            if(arr[i] == arr.length || arr[i] == i) i++;  
            else swap(i, arr[i], arr);        
        }
        
        for(i = 0; i<arr.length; i++){
            if(i != arr[i] ) return i;
        }
        
        return arr.length;
    }
    
    public static void swap(int i, int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}