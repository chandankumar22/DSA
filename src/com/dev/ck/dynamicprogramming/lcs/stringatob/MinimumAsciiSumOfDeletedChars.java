package com.dev.ck.dynamicprogramming.lcs.stringatob;

/*
        Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal.

        Example 1:
        Input: s1 = "sea", s2 = "eat"
        Output: 231
        Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
        Deleting "t" from "eat" adds 116 to the sum.
        At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.

        Example 2:
        Input: s1 = "delete", s2 = "leet"
        Output: 403
        Explanation: Deleting "dee" from "delete" to turn the string into "let",
        adds 100[d] + 101[e] + 101[e] to the sum.
        Deleting "e" from "leet" adds 101[e] to the sum.
        At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
        If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.*/
public class MinimumAsciiSumOfDeletedChars {


    public static int minimumDeleteSum(String s1, String s2) {
        int s1Sum = 0;
        int s2Sum = 0;
        for (int c : s1.toCharArray()) s1Sum += c;
        for (int c : s2.toCharArray()) s2Sum += c;
        String lcs = findLcs(s1, s2);
        // System.out.println(lcs);
        int lcsSum = 0;
        for (int c : lcs.toCharArray()) lcsSum += c;

        return (s1Sum - lcsSum) + (s2Sum - lcsSum);

    }

    public static String findLcs(String x, String y) {
        int m = x.length();
        int n = y.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) dp[i][0] = 0;
        for (int j = 0; j <= n; j++) dp[0][j] = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + (int) x.charAt(i - 1);
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        StringBuilder lcs = new StringBuilder();
        while (m > 0 && n > 0) {
            //System.out.println(m+" "+n);
            if (x.charAt(m - 1) == y.charAt(n - 1)) {
                lcs.append(x.charAt(m - 1));
                m--;
                n--;
            } else {
                if (dp[m - 1][n] > dp[m][n - 1]) {
                    m--;
                } else n--;
            }
        }
        return lcs.reverse().toString();
    }
}
