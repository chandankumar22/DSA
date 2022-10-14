package com.dev.ck.recursion.digits.productofdigits;

public class Main {

    public static void main(String[] args) {
        System.out.println(new ProductOfDigits().productOfDigits(12345));

        int n = 12345;
        int mul=1;
        while(n!=0){
            mul = mul * (n%10);
            n=n/10;
        }
        System.out.println(mul);
    }
}
