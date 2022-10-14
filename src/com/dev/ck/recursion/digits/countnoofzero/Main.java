package com.dev.ck.recursion.digits.countnoofzero;

public class Main {

    public static void main(String[] args) {
        int number = 9909;
        int count = 0;
        System.out.println(new CountNoOfZeroInNumber().count(number,count));
        while(number!=0){
            if(number%10==0) count++;
            number=number/10;
        }
        System.out.println(count);
    }
}
