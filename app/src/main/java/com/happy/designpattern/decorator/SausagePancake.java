package com.happy.designpattern.decorator;

public class SausagePancake extends APancakeDecorator {

    public SausagePancake(APancake aPancake) {
        super(aPancake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个火腿肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
