package com.dev.ck.recursion.bubblesort;

public class BubbleSort {

    public void sort(int []arr){
        printPattern1(arr,arr.length-1,0);
    }

    public void printPattern1(int []arr, int row, int col){
        if(row==0) return;
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            printPattern1(arr,row,col+1);
        }else{
//            System.out.println();
            printPattern1(arr,row-1,0);
        }
    }

    private void performBubbleSort(int []arr, int index, int pass){
        if(index==pass) return;
        if(index<pass){
            if(arr[index]>arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            performBubbleSort(arr,index+1,pass);
        }else performBubbleSort(arr,0,pass-1);
    }
}
