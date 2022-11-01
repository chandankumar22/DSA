package com.dev.ck.recursion.powerofn;

public class PowerOfNumber {

    public long powerOfNumber(int a, int b){
        if(b==0) return 1;
        if(b==1) return a;

        return a*powerOfNumber(a,b-1);
    }
}
