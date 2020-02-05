package com.happy.designpattern.strategy;

public class FanXianPromotion implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("这是一个返现活动");
    }
}
