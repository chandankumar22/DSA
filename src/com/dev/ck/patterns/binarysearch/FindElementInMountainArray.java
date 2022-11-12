package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-in-mountain-array/description/">...</a>
 * <p>
 * Hard 1095. Find in Mountain Array
 * <p>
 * You may recall that an array arr is a mountain array if and only if:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
 * <p>
 * Input: array = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
 */
public class FindElementInMountainArray {

    public static int findInMountainArray(int target, Integer [] arr) {
        int peak = findPeak(arr);
        int searchInLeftOfPeak = bsearch(arr, target, 0, peak);
        if(searchInLeftOfPeak != -1) return searchInLeftOfPeak;
        return bsearch(arr, target, peak, arr.length-1);
    }

    static int findPeak(Integer [] arr){
        int start = 0;
        int end = arr.length- 1;

        while (start < end){
            int mid = start + ((end - start)/2);
            if(arr[mid] > arr[mid+1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    static int bsearch(Integer[] arr, int target, int start, int end){
        boolean isAscending = arr[start] < arr[end];
        int ans = -1;
        while(start <= end){
            int mid = start + ((end-start)/2);
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
                continue;
            }

            if(isAscending){
                if(arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            }else{
                if(arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Pair<Integer[], Integer>[] testData = new Pair[]{
                new Pair<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 12, 13, 11, 10, 1}, 1),
                new Pair<>(new Integer[]{1, 112, 10, 9, 8, 7, 6}, 112),
                new Pair<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 150, 16}, 7)
        };

        for (Pair<Integer[], Integer> test : testData) {
            Integer[] arr = test.getFirst();
            Integer target = test.getSecond();
            System.out.println("Array = "+ Arrays.toString(arr)+ " target = "+target);

            int index = findInMountainArray(target, arr);
            System.out.println("Element is at " + index + " position\n");


        }
    }
}
