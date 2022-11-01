package com.dev.ck.recursion.firstuppercaseinstring;

public class DetectFirstUpperCase {

    public static char firstChar(String s, int index){
        if(index == s.length()) return ' ';
        if(s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') return s.charAt(index);
        return firstChar(s,index+1);
    }
}
