package com.dev.ck.dynamicprogramming.lcs.longestpalindromicsubsequence;

public class MinimumNumberOfDeletionToMakePalindrome {

    public static int findMinDel(String a){
        String b = new StringBuilder(a).reverse().toString();
        int m = a.length();
        int n = b.length();

        int [][]dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++) dp[i][0]=0;
        for(int j=0;j<=n;j++) dp[0][j]=0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1))dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        System.out.println("LCS LENGTH: "+dp[m][n]);

        return a.length()-dp[m][n];
    }
}
