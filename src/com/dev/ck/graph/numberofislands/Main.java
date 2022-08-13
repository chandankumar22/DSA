package com.dev.ck.graph.numberofislands;

public class Main {

    public static void main(String[] args) {
        String [][]grid = {
                {"1", "1", "1", "1", "0"},
                {"1", "1", "0", "1", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "0", "0", "0"}
        };
        System.out.println(new NumberOfIslands().numIslands(grid));
    }
}
