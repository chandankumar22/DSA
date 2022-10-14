package com.dev.ck.recursion.reversenumber;


/**
 * rev(1234) = 4*10^3 + rev(123)
 * rev(123) = 3*10^2 + rev(12)
 * ......
 * ....
 * rev(n) = (n%10)*10^((digits in n)-1) + rev(n/10)
 */
public class ReverseNumber {

    public int reverse(int number){
        int digits = (int)Math.log10(number);
        return reverseHelper(number,digits);
    }

    public int reverseHelper(int number, int count){
        // This base condition means last digit is there in number, as number/10 will give 0 when it is less than 10,
        // i.e. single digit
        if(count<0) return number;

        //simple logic here, remainder*10 ki power count + recurrence
        return (number%10)*(int)Math.pow(10,count) + reverseHelper(number /10,count-1);
    }
}
