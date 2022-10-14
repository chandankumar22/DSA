package com.dev.ck.recursion.stepstogetzero;

public class Main {

    public static void main(String[] args) {
        int num = 9172;
        System.out.println(new ReduceNumberToZero().numberOfSteps(num));
        int ans = 0;
        while(num!=0){
            if(num%2==0) num/=2;
            else num--;
            ans++;
        }
        System.out.println(ans);

    }
}
