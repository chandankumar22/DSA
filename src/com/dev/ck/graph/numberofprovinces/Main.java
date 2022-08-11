package com.dev.ck.graph.numberofprovinces;

public class Main {

    public static void main(String[] args) {
        int [][]isConnected = {{1,1,0},{1,1,0}, {0,0,1}};
        new NumberOfProvinces().findCircleNum(isConnected);
    }
}
