package com.dev.ck.dynamicprogramming.lcs.longestcommonsubstring;

public class Main {

    public static void main(String[] args) {
        String x = "aacabdkacaa";
        String y = "abcabacbakbbdk";
	    int ans = LongestCommonSubstring.findLengthOfLongestCommonSubstring(x,new StringBuilder(x).reverse().toString());
        System.out.println(ans);
    }
}
