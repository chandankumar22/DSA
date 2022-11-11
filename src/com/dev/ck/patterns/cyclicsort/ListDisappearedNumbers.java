package com.dev.ck.patterns.cyclicsort;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">...</a>
 * <p>
 * Easy 448. Find All Numbers Disappeared in an Array
 * <p>
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 * <p>
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 */
class ListDisappearedNumbers {

    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        System.out.println(new ListDisappearedNumbers().findDisappearedNumbers(arr));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i = 0;
        while(i < nums.length){
            if(i != nums[i] - 1 && nums[i] != nums[nums[i] - 1]) swap(i, nums[i]-1, nums);
            else i++;
        }
        
        List<Integer> ans =  new ArrayList<>();
        for(i = 0; i < nums.length; i++){
            if(i != nums[i] - 1) ans.add(i + 1);
        }
        
        return ans;
        
    }
    
    public void swap(int i, int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}