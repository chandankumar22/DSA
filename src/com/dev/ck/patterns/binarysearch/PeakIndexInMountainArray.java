package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-peak-element/">...</a>
 * Medium 162. Find Peak Element
 * <p>
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 * <p>
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 * <p>
 *
 * <a href="https://leetcode.com/problems/peak-index-in-a-mountain-array/">...</a>
 * Medium 852. Peak Index in a Mountain Array
 * <p>
 * An array arr a mountain if the following properties hold:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 * <p>
 * Input: arr = [0,10,5,2]
 * Output: 1
 */
public class PeakIndexInMountainArray {

    public static int findPeakIndex(Integer[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                //this mid can be the potential answer as we are in the decreasing side of the array, so the elements at the right
                //is already smaller than this mid, but there can be the possibility, on left hand side of array, we find elements greater or
                //smaller than this mid-element. So search on the left side now.
                end = mid;
            } else {
                //this mid is smaller than its next element, which means that we are in the increasing side of the array, hence it is
                //obvious that the peak element must be on the right side of the array, so search in right side of the array
                start = mid + 1;
            }
        }
        //when the loop is over, it means that both start and end are now pointing to the same element, so this element must be the peak
        return start;

    }

    public static void main(String[] args) {
        Pair<Integer[], Integer>[] testData = new Pair[]{
                new Pair<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 12, 13, 11, 10, 1}, 1),
                new Pair<>(new Integer[]{1, 112, 10, 9, 8, 7, 6}, 16),
                new Pair<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 150, 16}, 14)
        };

        for (Pair<Integer[], Integer> test : testData) {
            Integer[] arr = test.getFirst();

            System.out.println("Array = " + Arrays.toString(arr));

            int index = findPeakIndex(arr);
            System.out.println("Peak element is at " + index + " position\n");


        }
    }
}
