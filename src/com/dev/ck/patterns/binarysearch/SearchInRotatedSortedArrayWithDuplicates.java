package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;
import java.util.Objects;

/**
 * <a href="hhttps://leetcode.com/problems/search-in-rotated-sorted-array-ii/">...</a>
 * Medium 381. Search in Rotated Sorted Array II
 * <p>
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums
 * <p>
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 */
public class SearchInRotatedSortedArrayWithDuplicates {

    static public int search(Integer[] nums, int target) {

        int pivot = nums.length - 1;
        int start = 0;
        int end = nums.length - 1;
        if (nums[0] < nums[nums.length - 1]) {
            pivot = 0;
        } else {
            while (start < end) {
                int mid = start + ((end - start) / 2);

                if (mid == nums.length - 1 || nums[mid] > nums[mid + 1]) {
                    pivot = mid;
                    break;
                }
                else if(end < nums.length-1 && nums[end] > nums[end+1]){
                    pivot = end;
                    break;
                }
                else if(Objects.equals(nums[start], nums[mid]) && Objects.equals(nums[mid], nums[end])) end-=1;
                else if (nums[start] > nums[mid]) end = mid;
                else start = mid;

            }
        }


        System.out.println("Pivot : " + pivot);

        if (target > pivot) return bsearch(nums, target, 0, pivot);
        return bsearch(nums, target, pivot + 1, nums.length-1);

    }

    static int bsearch(Integer[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] < target) start = mid + 1;
            else if (nums[mid] > target) end = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Pair<Integer[], Integer>[] testData = new Pair[]{
//                new Pair<>(new Integer[]{1,1,1,1,3,1}, 3),
//                new Pair<>(new Integer[]{1,0,1,1,1,1}, 1),
//                new Pair<>(new Integer[]{1,0,1,1,1,1}, 0),
//                new Pair<>(new Integer[]{1,1,1,1,0,1}, 1),
//                new Pair<>(new Integer[]{1,1,1,1,0,1}, 0),
//                new Pair<>(new Integer[]{1,1,1,0,1,1}, 1),
//                new Pair<>(new Integer[]{1,1,1,0,1,1}, 0),
//                new Pair<>(new Integer[]{1,2,3,4,5,6,7,0}, 0),
//                new Pair<>(new Integer[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1}, 2),
                new Pair<>(new Integer[]{1,1,1,1,0,0,0,0,0,0,1,1}, 0)
        };

        for (Pair<Integer[], Integer> test : testData) {
            Integer[] arr = test.getFirst();
            Integer target = test.getSecond();

            System.out.println("Array = " + Arrays.toString(arr) + " target = " + target);

            int index = search(arr, target);
            System.out.println("Element is at " + index + " position\n");

        }
    }
}
