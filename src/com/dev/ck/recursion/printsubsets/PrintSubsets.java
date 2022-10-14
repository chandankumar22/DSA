package com.dev.ck.recursion.printsubsets;

public class PrintSubsets {

    public void printSubsets(String input, String output, int index) {
        if (index == input.length()) {
            System.out.println(output);
            return;
        }
        String take = output + input.charAt(index);

        printSubsets(input, take, index + 1);
        printSubsets(input, output, index + 1);
    }
}
