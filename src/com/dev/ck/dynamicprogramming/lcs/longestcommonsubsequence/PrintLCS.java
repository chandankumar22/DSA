package com.dev.ck.dynamicprogramming.lcs.longestcommonsubsequence;

public class PrintLCS {

    public static String getLCS(String x, String y){
        FindLengthOfLCS.findLengthOfLCS(x,y);
        int[][] dp = FindLengthOfLCS.dp;
        int i = x.length();
        int j = y.length();
        StringBuilder ans = new StringBuilder();
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                ans.append(x.charAt(i-1));
                i--;j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        return ans.reverse().toString();
    }
}
