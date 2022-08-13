package com.dev.ck.graph.centerofgraph;

public class Main {

    public static void main(String[] args) {

        int [][] adjList = {{1,2},{2,3},{2,4}};
        System.out.println(new CenterOfGraph().findCenter(adjList));
    }
}
