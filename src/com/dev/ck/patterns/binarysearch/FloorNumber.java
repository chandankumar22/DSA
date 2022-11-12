package com.dev.ck.patterns.binarysearch;

import com.dev.ck.utils.Pair;

import java.util.Arrays;

public class FloorNumber {

    public static int floorNumber(Integer []arr, Integer target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + ((end-start)/2);
            if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
            else return mid;
        }
        if(end < 0) return -1;
        return end;
    }

    public static void main(String[] args) {
        Pair<Integer [], Integer> []testData= new Pair[]{
                new Pair<>(new Integer[]{11,12,31,41,56,63,79}, 32),
                new Pair<>(new Integer[]{11,12,31,41,56,63,79}, 78),
                new Pair<>(new Integer[]{11,12,31,41,56,63,79}, 80),
                new Pair<>(new Integer[]{11,12}, 10),
                new Pair<>(new Integer[]{11}, 11)
        };

        for (Pair<Integer[], Integer> test : testData) {
            Integer[] arr = test.getFirst();
            Integer target = test.getSecond();

            System.out.println("Array = "+ Arrays.toString(arr)+ "\ntarget = "+target);

            int index = floorNumber(arr,target);
            if (index == -1) System.out.println(target+" is less than the smallest number "+arr[0]+" in the array\n");
            else System.out.println("Greatest smaller number than "+target+" is "+arr[index]+"\n");
        }

    }
}
