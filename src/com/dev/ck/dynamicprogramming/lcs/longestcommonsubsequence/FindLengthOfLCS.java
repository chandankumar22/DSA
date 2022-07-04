package com.dev.ck.dynamicprogramming.lcs.longestcommonsubsequence;

public class FindLengthOfLCS {

    public static int [][]dp;

    public static int findLengthOfLCS(String x, String y){
        //find the length of the strings
        int m = x.length();
        int n = y.length();

        //dp array to store the results which will be used later
        dp = new int[m+1][n+1];

        //initialise the dp with the base condition
        //if there is no element in any of the string then the lcs will have nothing, i.e. it will be a empty string.
        for(int i=0;i<=m;i++) dp[i][0]=0;
        for(int j=0;j<=n;j++) dp[0][j]=0;

        //logic of lcs is simple, if the ith character in string x matches with the jth character in string y, then lcs
        //length will be one more than the length from previous, i.e. i-1,j-1, but if it not equals , then it simply is the
        //maximum of the values from the previous row in same column and previous column from the same row of the dp.
         for (int i=1;i<=m;i++){
             for(int j=1;j<=n;j++){
                 if(x.charAt(i-1)==y.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                 else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
             }
         }

         return dp[m][n];

    }
}
