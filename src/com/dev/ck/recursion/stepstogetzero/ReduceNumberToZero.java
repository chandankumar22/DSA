package com.dev.ck.recursion.stepstogetzero;

public class ReduceNumberToZero {

    public int numberOfSteps(int num) {
        return count(num,0);
    }

    public int count(int num, int count){
        if(num==0) return count;
        int x = num/2;
        if(x%2==0) return count(x,count+1);
        return count(num-1,count+1);
    }
}
