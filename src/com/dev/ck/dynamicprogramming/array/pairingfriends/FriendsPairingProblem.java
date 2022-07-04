package com.dev.ck.dynamicprogramming.array.pairingfriends;

public class FriendsPairingProblem {


    /**
     * The logic here is to find a recurrence relation which satisfies the problem statement. It is given in question that
     * either a person go single in party, or can pair with one of the remaining persons. There are two ways, so to find the
     * total number of ways, we need to add both the ways. For any nth person, if he goes single, then there will be n-1 person
     * left to be solved. So, 1*f(n-1) will tell us if person went single. In simple words if 3 persons are there and all of them
     * decided to go single then there will be 3 ways only, straightforward na.
     * Now of any nth person decide to pair up, he has n-1 persons from which he can choose one to pair up. So he has n-1C1
     * ways to choose 1 person from n-1 person, and once he chooses, there will be n-2 people left to make the choices. So total
     * choices will be n-1C1= (n-1) multiplies by n-2 ways.
     *
     * f(n) = f(n-1) + (n-1)*f(n-2)
     */
    public static int numberOfWaysToPair(int num){

        if(num==1 || num == 2) return num;


        int []dp = new int[num+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=num;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[num];
    }
}
