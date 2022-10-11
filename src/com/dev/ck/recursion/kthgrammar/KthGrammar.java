package com.dev.ck.recursion.kthgrammar;

public class KthGrammar {

    public int kthGrammar(int n, int k) {
        if(n==1 && k==1) return 0;
        int length = (int)Math.pow(2,n-1);
        int mid = length/2;

        if(k<=mid) return kthGrammar(n-1,k);
        else{
            int ans = kthGrammar(n-1,k-mid);
            if(ans==0) return 1;
            return 0;
        }
    }
}
