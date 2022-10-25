package com.dev.ck.recursion.checksortedarray;

public class Main {

    public static void main(String[] args) {
        int []arr = {1,3,8};
        System.out.println(new CheckIfArrayIsSorted().checkSortedArray(arr));

        boolean ans = true;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
