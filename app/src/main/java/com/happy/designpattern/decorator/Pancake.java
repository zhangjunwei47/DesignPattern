package com.happy.designpattern.decorator;

public class Pancake extends APancake {
    @Override
    protected String getDesc() {
        return "只是一个煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
