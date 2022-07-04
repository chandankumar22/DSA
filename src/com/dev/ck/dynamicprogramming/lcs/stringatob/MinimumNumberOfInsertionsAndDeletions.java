package com.dev.ck.dynamicprogramming.lcs.stringatob;


//Minimum number of insertions and deletions to make string a to string b
public class MinimumNumberOfInsertionsAndDeletions {

    public static int findLcsLength(String x, String y){

        int m= x.length();
        int n=y.length();

        int [][]dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++) dp[i][0] = 0;
        for(int j=0;j<=n;j++) dp[0][j] = 0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1) == y.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    public static int[] findSolution(String x, String y){
        int lcsLength = findLcsLength(x, y);
        int insertions = y.length()-lcsLength;
        int deletions = x.length()-lcsLength;
        return new int[]{insertions,deletions};
    }
}
