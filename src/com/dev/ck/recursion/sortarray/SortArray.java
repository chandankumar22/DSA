package com.dev.ck.recursion.sortarray;

import java.util.Arrays;

public class SortArray {

    public void sortArray(int []nums){
        sort(nums.length-1,nums);
        System.out.println(Arrays.toString(nums));
    }

    public void sort(int index,int []nums){
        if(index == 0) return;
        sort(index-1,nums);
        insert(index-1,nums,nums[index]);
    }

    public void insert(int index, int []nums, int num){
        if(index<0 || nums[index] <= num){
            nums[index+1] = num;
            return;
        }
        int temp = nums[index];
        insert(index-1,nums,num);
        nums[index+1] = temp;
    }
}
