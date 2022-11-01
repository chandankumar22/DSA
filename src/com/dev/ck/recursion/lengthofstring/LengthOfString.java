package com.dev.ck.recursion.lengthofstring;

public class LengthOfString {

    public static int length(String s, int index){
        if(index==1) return 1;
        return 1 + length(s,index-1);
    }
}
