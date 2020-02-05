package com.happy.designpattern.strategy;

public class ManJianPromotion implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("这是一个满减活动");
    }
}
