package com.dev.ck.recursion.selectionsort;

public class SelectionSort {

    public void sort(int []arr){
        performSelectionSort(arr,arr.length,0, 0);
    }

    private void performSelectionSort(int[] arr, int row, int col, int maxIndex) {
        if(row==0) return;
        if(col<row){
            if(arr[maxIndex]<arr[col]) maxIndex = col;
            performSelectionSort(arr,row,col+1,maxIndex);
        }else{
            int temp = arr[col-1];
            arr[col-1] = arr[maxIndex];
            arr[maxIndex] = temp;
            performSelectionSort(arr,row-1,0,0);
        }


    }
}
