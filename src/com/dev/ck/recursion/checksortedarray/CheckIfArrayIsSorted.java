package com.dev.ck.recursion.checksortedarray;

public class CheckIfArrayIsSorted {

    public boolean checkSortedArray(int[] arr) {
        return check(arr,0);
    }

    private boolean check(int[] arr, int index) {
        if (index == arr.length - 1) return true;

        if (arr[index] <= arr[index + 1]) return check(arr, index + 1);
        return false;
    }
}
