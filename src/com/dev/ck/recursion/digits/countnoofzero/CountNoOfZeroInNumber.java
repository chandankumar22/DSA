package com.dev.ck.recursion.digits.countnoofzero;

public class CountNoOfZeroInNumber {

    public int count(int number, int count){
        if(number/10 == 0) return count;
        int rem = number%10;
        if(rem==0) return count(number/10,count+1);
        else return count(number/10,count);
    }
}
