package com.happy.designpattern.decorator;

public class EggPancake extends APancakeDecorator {

    public EggPancake(APancake aPancake) {
        super(aPancake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+ "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
