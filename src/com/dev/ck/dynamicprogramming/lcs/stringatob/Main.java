package com.dev.ck.dynamicprogramming.lcs.stringatob;

public class Main {
    public static void main(String[] args) {
        String a = "heap";
        String b = "pea";
        print(MinimumNumberOfInsertionsAndDeletions.findLcsLength(a,b)+"");


        for (int ans : MinimumNumberOfInsertionsAndDeletions.findSolution(a, b)) {
            print(ans+"");
        }

       print(MinimumNumberOfDeletionsOnly.findSolution(a,b)+"");

        print(MinimumAsciiSumOfDeletedChars.minimumDeleteSum(a,b)+"");
    }

    public static void print(String s){
        System.out.println(s);
    }
}
