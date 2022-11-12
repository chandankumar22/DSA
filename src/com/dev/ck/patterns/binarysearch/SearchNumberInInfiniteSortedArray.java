package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;

public class SearchNumberInInfiniteSortedArray {

    public static int search(Integer []nums, int target){

        int start = 0;
        int end = 0;

        while(target > nums[end]){
            int length = (end - start + 1) * 2;
            start = end + 1;
            end = end + length;
        }

        while(start <= end){
            int mid = start + ((end - start)/2);
            if(nums[mid] < target) start = mid + 1;
            else if(nums[mid] > target) end = mid - 1;
            else return mid;
        }

        throw new IndexOutOfBoundsException("Number not present in the array");
    }

    public static void main(String[] args) {
        Pair<Integer [], Integer>[]testData= new Pair[]{
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,13,13,14,15,16}, 1),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,13,13,14,15,16}, 16),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,13,13,14,15,16}, 14),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,13,13,14,15,16}, 3),
                new Pair<>(new Integer[]{1,2,3,4,5,6,7,8,9,11,12,13,13,14,15,16}, 31),
        };

        for (Pair<Integer[], Integer> test : testData) {
            Integer[] arr = test.getFirst();
            Integer target = test.getSecond();

            System.out.println("Array = "+ Arrays.toString(arr)+ " target = "+target);

            try {
                int index = search(arr, target);
                System.out.println("Element is at "+index+" position\n");
            }catch (IndexOutOfBoundsException exception){
                System.out.println("Error : "+exception.getMessage()+"\n");
            }




        }
    }
}
