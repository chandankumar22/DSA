package com.dev.ck.dynamicprogramming.lcs.longestpalindromicsubsequence;

public class FindLongestPalindromicSubsequence {


    //The loongest palindromic subsequence of string x is the lcs between the lcs of the string x and the reverse of the
    //reverse of x
    public static String findLPS(String x){
        return findLcsString(x,new StringBuilder(x).reverse().toString());
    }

    private static String findLcsString(String x, String y){
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

        StringBuilder sb = new StringBuilder();
        while(m>0 && n>0){
            if(x.charAt(m-1) == y.charAt(n-1)) sb.append(x.charAt(m---1));
            else{
                if(dp[m-1][n]>dp[m][n-1]) m--;
                else n--;
            }
        }

        return sb.reverse().toString();
    }
}
