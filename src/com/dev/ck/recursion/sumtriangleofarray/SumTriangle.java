package com.dev.ck.recursion.sumtriangleofarray;

public class SumTriangle {

    public long[] getTriangle(long[] arr, long n)
    {
        long []temp;
        if(n==1){
            temp = new long[1];
            temp[0] = arr[0];
            return temp;
        };
        temp = new long[arr.length-1];


        for(int i=0;i<arr.length-1;i++) temp[i] = arr[i] + arr[i+1];

        long []downAns = getTriangle(temp,temp.length);

        long []ans = new long[arr.length+downAns.length];

        int j=0;
        for (long downAn : downAns) ans[j++] = downAn;
        for (long l : arr) ans[j++] = l;

        return ans;
    }

    public long[] getTriangleSum(long[] arr, long n)
    {
        long []temp;
        if(n==1){
            temp = new long[1];
            temp[0] = arr[0];
            return temp;
        };
        temp = new long[arr.length-1];


        for(int i=0;i<arr.length-1;i++) temp[i] = arr[i] + arr[i+1];

        long []downAns = getTriangleSum(temp,temp.length);

        long []ans = new long[arr.length+downAns.length];

        int j=0;
        for (long downAn : downAns) ans[j++] = downAn;
        for (long l : arr) ans[j++] = l;

        return ans;
    }
}
