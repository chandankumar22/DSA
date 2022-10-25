package com.dev.ck.recursion.mergesort;

import java.util.Arrays;

public class MergeSort {

    public int[] sort(int []arr){
        return performMergeSort(arr,0,arr.length);
    }

    private int [] performMergeSort(int[] arr, int start, int end) {
        if(arr.length==1) return arr;
        int mid = (start+end)/2;

        int[] left = performMergeSort(Arrays.copyOfRange(arr,start,mid),start,mid);
        int[] right = performMergeSort(Arrays.copyOfRange(arr,mid+1,end),mid+1,end);

        int i=0,j=0,k=0;
        int []sortedArr = new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
                sortedArr[k] = right[j];
                j++;
            }else{
                sortedArr[k] = left[i];
                i++;
            }
            k++;
        }
        while(i < left.length){
            sortedArr[k++] = left[i++];
        }
        while(j<right.length){
            sortedArr[k++] = right[j++];
        }
        return sortedArr;
    }
}
