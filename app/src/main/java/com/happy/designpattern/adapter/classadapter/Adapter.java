package com.happy.designpattern.adapter.classadapter;

public class Adapter extends AC220V implements DC5V {
    @Override
    public int output() {
        return super.output()/100;
    }
}
