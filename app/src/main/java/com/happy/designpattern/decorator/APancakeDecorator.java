package com.happy.designpattern.decorator;

public abstract class APancakeDecorator extends APancake {

    private APancake aPancake;

    public APancakeDecorator(APancake aPancake) {
        this.aPancake = aPancake;
    }

    @Override
    protected String getDesc() {
        return this.aPancake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aPancake.cost();
    }
}
