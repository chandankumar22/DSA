package com.dev.ck.dynamicprogramming.lcs.longestpalindromicsubsequence;

public class FindLengthLongestPalindromicSubsequence {


    //The longest palindromic subsequence of string x is the lcs between the lcs of the string x and the reverse of the
    //reverse of x
    public static int findLengthOfLPS(String x){
        return findLcsLength(x,new StringBuilder(x).reverse().toString());
    }

    private static int findLcsLength(String x, String y){
        System.out.println("Finding Lcs on : "+x+" and "+y);
        int m = x.length();
        int n = y.length();

        int [][]dp = new int [m+1][n+1];

        for(int i=0;i<=m;i++) dp[i][0] = 0;
        for(int j=0;j<=n;j++) dp[0][j] = 0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }

        return dp[m][n];
    }
}
