package com.happy.designpattern.adapter.objectadapter;

public class Adapter implements DC5V {
    private AC220V ac220V = new AC220V();
    @Override
    public int output() {
        int x = ac220V.output() /100;
        return x;
    }
}
