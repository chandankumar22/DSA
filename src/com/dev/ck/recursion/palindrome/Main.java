package com.dev.ck.recursion.palindrome;

public class Main {

    public static void main(String[] args) {
        String str = "nayydan";
        System.out.println(new IsPalindromeString().isPalindrome(str, 0, str.length() - 1));
    }
}
