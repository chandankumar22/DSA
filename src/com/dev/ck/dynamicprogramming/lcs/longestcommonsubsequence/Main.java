package com.dev.ck.dynamicprogramming.lcs.longestcommonsubsequence;

public class Main {

    public static void main(String[] args) {
	    int ans = FindLengthOfLCS.findLengthOfLCS("abc","cba");
        System.out.println(ans);
        System.out.println(PrintLCS.getLCS("sea","eat"));
    }
}
