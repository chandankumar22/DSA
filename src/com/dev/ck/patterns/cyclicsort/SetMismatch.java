package com.dev.ck.patterns.cyclicsort;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/set-mismatch/">...</a>
 * <p>
 * Easy 645. Set Mismatch
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
 * one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss
 * of another number.
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 * <p>
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 */
class SetMismatch {


    public static void main(String[] args) {
        int []arr = {1,2,2,4};
        System.out.println(Arrays.toString(new SetMismatch().findErrorNums(arr)));
    }

    public int[] findErrorNums(int[] nums) {
        
            int i = 0;
            while(i < nums.length){

                if(nums[nums[i]-1] != nums[i]){ // 
                    if(nums[i]-1 == i) i++;
                    else swap(i , nums[i]-1, nums);
                }else i++;

                
            }

            int []ans = new int[2];
            for(i = 0; i < nums.length; i++){
                if(nums[i] -1 != i){
                    ans[0] = nums[i];
                    ans[1] = i+1;
                }
            }
            return ans;

    }

    public void swap(int i, int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}