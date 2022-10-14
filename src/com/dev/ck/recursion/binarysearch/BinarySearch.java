package com.dev.ck.recursion.binarysearch;

public class BinarySearch {

    public int binarySearch(int []arr, int target){
        //{1,3,5,6,9,11,34,56}
        return search(arr,target,0,arr.length-1);
    }

    private int search(int []arr, int target, int start, int end){
        if(start>end) return -1;
        int mid = start + (end - start)/2;
        if(target == arr[mid]) return mid;
        if(target < arr[mid]) return search(arr, target, start, mid-1);
        return search(arr, target, mid+1, end);
    }
}
