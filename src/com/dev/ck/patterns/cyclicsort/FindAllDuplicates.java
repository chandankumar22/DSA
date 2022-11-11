package com.dev.ck.patterns.cyclicsort;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-all-duplicates-in-an-array/">...</a>
 * <p>
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
 * <p>
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 */
public class FindAllDuplicates {

    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        System.out.println(new FindAllDuplicates().findDuplicates(arr));
    }

    public List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while(i < nums.length){
            if(nums[i]-1 == i || nums[nums[i]-1] == nums[i]) i++;
            else swap(i, nums[i]-1, nums);
        }

        List<Integer> ans = new ArrayList<Integer>();
        for(i = 0; i < nums.length; i++){
            if(i != nums[i]-1) ans.add(nums[i]);
        }

        return ans;
    }

    public void swap(int i , int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
