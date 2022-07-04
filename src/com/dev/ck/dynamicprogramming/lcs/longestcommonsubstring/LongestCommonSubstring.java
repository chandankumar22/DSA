package com.dev.ck.dynamicprogramming.lcs.longestcommonsubstring;

public class LongestCommonSubstring {

    public static int [][]dp;

    public static int findLengthOfLongestCommonSubstring(String x, String y){

        int m = x.length();
        int n = y.length();


        dp = new int[m+1][n+1];


        for(int i=0;i<=m;i++) dp[i][0]=0;
        for(int j=0;j<=n;j++) dp[0][j]=0;

        int max = 0;


         for (int i=1;i<=m;i++){
             for(int j=1;j<=n;j++){
                 if(x.charAt(i-1)==y.charAt(j-1)) {
                     dp[i][j] = dp[i-1][j-1]+1;
                     max = Math.max(max,dp[i][j]);
                 }
                 else dp[i][j] = 0; //since for substring, discontinuity is not allowed.
             }
         }

         return max;

    }
}
