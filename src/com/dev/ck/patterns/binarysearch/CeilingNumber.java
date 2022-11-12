package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;

public class CeilingNumber {

    public static int ceilingNumber(Integer[] arr, Integer target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] < target) start = mid + 1;
            else if (arr[mid] > target) end = mid - 1;
            else return mid;
        }
        if (start == arr.length) return -1;
        return start;
    }


    public static void main(String[] args) {
        Pair<Integer[], Integer>[] testData = new Pair[]{
                new Pair<>(new Integer[]{11, 12, 31, 41, 56, 63, 79}, 10),
                new Pair<>(new Integer[]{11, 12, 31, 41, 56, 63, 79}, 78),
                new Pair<>(new Integer[]{11, 12, 31, 41, 56, 63, 79}, 29),
                new Pair<>(new Integer[]{11, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31}, 12),
                new Pair<>(new Integer[]{11, 12}, 12),
                new Pair<>(new Integer[]{11}, 12)
        };

        for (Pair<Integer[], Integer> test : testData) {
            Integer[] arr = test.getFirst();
            Integer target = test.getSecond();

            System.out.println("Array = " + Arrays.toString(arr) + "\ntarget = " + target);

            int index = ceilingNumber(arr, target);
            if (index == -1)
                System.out.println(target + " excceds the largest number " + arr[arr.length - 1] + " in the array\n");
            else System.out.println("Smallest greater number than " + target + " is " + arr[index] + "\n");
        }

    }
}
