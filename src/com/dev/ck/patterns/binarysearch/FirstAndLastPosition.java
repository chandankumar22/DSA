package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/">...</a>
 * <p>
 * Medium 34. Find First and Last Position of Element in Sorted Array
 * <p>
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1]
 * <p>
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */
public class FirstAndLastPosition {

    public static int[] searchRange(Integer[] nums, int target) {
        int []ans = new int[2];
        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, false);
        return ans;
    }

    public static int binarySearch(Integer []nums, int target, boolean isFirst){
        int start = 0;
        int end = nums.length-1;
        int position = -1;
        while(start <= end) {
            int mid = start + ((end - start)/2);
            if(nums[mid] < target) start = mid + 1;
            else if(nums[mid] > target) end = mid - 1;
            else{
                position = mid;
                if(isFirst) end = mid - 1;
                else start = mid + 1;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        Pair<Integer [], Integer>[]testData= new Pair[]{
                new Pair<>(new Integer[]{11,11,11,11,11,63,79}, 11),
                new Pair<>(new Integer[]{11,12,31,41,56,63,79}, 41),
                new Pair<>(new Integer[]{}, 80),
                new Pair<>(new Integer[]{11,12}, 12),
                new Pair<>(new Integer[]{11}, 11)
        };

        for (Pair<Integer[], Integer> test : testData) {
            Integer[] arr = test.getFirst();
            Integer target = test.getSecond();

            System.out.println("Array = "+ Arrays.toString(arr)+ " target = "+target);
            System.out.println("Range : "+Arrays.toString(searchRange(arr,target))+"\n");
        }
    }
}
