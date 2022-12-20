package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;

public class RotationCountInRotatedSortedArray {

    public static int numberOfRotation(Integer []nums){

        int start = 0;
        int end = nums.length-1;
        int pivot = -1;
        if(nums[0] < nums[nums.length - 1]) {
            return 0;
        }else{
            while (start <= end){
                int mid = start + ((end-start)/2);

                if(mid < nums.length-1 && nums[mid] > nums[mid + 1]){
                    pivot = mid;
                    break;
                }
                else if (end < nums.length-1 && nums[end] > nums[end+1]){
                    pivot = end;
                    break;
                } else if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                    end-=1;
                } else if (nums[start] > nums[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
        }
        return nums.length-(pivot+1);
    }

    public static void main(String[] args) {
        Pair<Integer[], Integer>[] testData = new Pair[]{
                new Pair<>(new Integer[]{1,1,1,1,3,1}, 3),
                new Pair<>(new Integer[]{1,0,1,1,1,1}, 1),
                new Pair<>(new Integer[]{1,0,1,1,1,1}, 0),
                new Pair<>(new Integer[]{1,1,1,1,0,1}, 1),
                new Pair<>(new Integer[]{1,1,1,1,0,1}, 0),
                new Pair<>(new Integer[]{1,1,1,0,1,1}, 1),
                new Pair<>(new Integer[]{1,1,1,0,1,1}, 0),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,0}, 0),
                new Pair<>(new Integer[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1}, 2),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9}, 2)
        };

        for (Pair<Integer[], Integer> test : testData) {
            Integer[] arr = test.getFirst();

            System.out.println("Array = " + Arrays.toString(arr));

            int rotation = numberOfRotation(arr);
            System.out.println("Array is rotated by " + rotation + " rotations\n");

        }
    }
}
