package com.dev.ck.recursion.reversenumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ReverseNumber().reverse(12345234));
        int n = 34567;
        int rev = 0;
        while(n!=0){
            int r = n%10;
            rev = rev*10 + r;
            n=n/10;
        }
        System.out.println(rev);
    }
}
