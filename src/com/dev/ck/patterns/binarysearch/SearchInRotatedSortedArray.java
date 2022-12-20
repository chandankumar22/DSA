package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/description/">...</a>
 * Medium 33. Search in Rotated Sorted Array
 * <p>
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 */
public class SearchInRotatedSortedArray {

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
                } else if (nums[start] > nums[mid]) end = mid;
                else start = mid;

            }
        }


        System.out.println("Pivot : " + pivot);

        int index = bsearch(nums, target, 0, pivot);
        if (index == -1) index = bsearch(nums, target, pivot + 1, nums.length - 1);
        return index;

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
                new Pair<>(new Integer[]{4, 5, 6, 7, 0, 1, 2}, 0),
                new Pair<>(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7}, 4),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,0}, 0),
                /*new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,13,13,14,15,16}, 14),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,13,13,14,15,16}, 3),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,13,13,14,15,16}, 31),*/
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
