package com.dev.ck.dynamicprogramming.lcs.longestpalindromicsubsequence;

public class Main {

    public static void main(String[] args) {
        String s = "agcbca";
        String lps = FindLongestPalindromicSubsequence.findLPS(s);
        System.out.println(lps);
        int lpsLen = MinimumNumberOfDeletionToMakePalindrome.findMinDel(s);
        System.out.println(lpsLen);



    }
}
