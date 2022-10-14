package com.dev.ck.recursion.digits.sumofdigits;

public class Main {

    public static void main(String[] args) {
        System.out.println(new SumOfDigits().sumOfDigits(123456789));

        int n = 123456789;
        int sum=0;
        while(n!=0){
            sum = sum + n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
