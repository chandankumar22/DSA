package com.dev.ck.recursion.digits.productofdigits;

public class ProductOfDigits {

    public int productOfDigits(int number){
        if(number/10==0) return number;
        return number%10 * productOfDigits(number/10);
    }
}
